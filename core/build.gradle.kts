plugins {
    alias(libs.plugins.lombokPlugin)
    id("core-dependencies-conventions")
    id("common-dependencies-conventions")
    id("ui-dependencies-conventions")
    `java-library`
}

repositories {
    mavenCentral()
}

group = "org.example"
version = "1.0-SNAPSHOT"