//pluginManagement {

//    repositories {
//        gradlePluginPortal()
//        mavenCentral()
//    }
//}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

//@Suppress("UnstableApiUsage")
//dependencyResolutionManagement {
//
//    repositories {
//        mavenCentral()
//    }
//}

includeBuild("build-logic")

rootProject.name = "silaryionau_automation"

include("api", "core", "test")
include("ui")