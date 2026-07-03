plugins {
    `java-library`
    alias(libs.plugins.lombokPlugin)
    alias(libs.plugins.allurePlugin)
    id("common-dependencies-conventions")
    id("test-dependencies-conventions")
}

repositories {
    mavenCentral()
}

allure {
    version = libs.allure.get().version
    adapter {
        frameworks {
            junit5 {
                enabled = true
                autoconfigureListeners = true
            }
        }
        resultsDir.set(rootProject.layout.projectDirectory.dir("allure-results"))
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

val agent: Configuration by configurations.creating {
    isCanBeResolved = true
    isCanBeConsumed = true
}

dependencies {
    api(project(":api"))
    api(project(":core"))
    testImplementation(project(":ui"))

    agent(libs.aspectj)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform() {
        val tag = System.getProperty("tag")

        if (!tag.isNullOrBlank()) {
            includeTags(tag)
        }
    }

    systemProperty(
        "env",
        System.getProperty("env") ?: "ui.staging"
    )
}

tasks.test {

    jvmArgs = listOf(
        "-javaagent:${agent.singleFile}"
    )

    testLogging {
        showStandardStreams = true
    }
}