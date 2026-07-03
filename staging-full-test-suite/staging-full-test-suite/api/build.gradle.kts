plugins {
    alias(libs.plugins.lombokPlugin)
    id("api-dependencies-conventions")
    id("common-dependencies-conventions")
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    api(project(":core"))
    implementation(libs.allureRestAssured)
}

group = "org.example"
version = "1.0-SNAPSHOT"