import org.gradle.api.artifacts.VersionCatalogsExtension


plugins {
    java
}

var libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

dependencies {
    implementation(libs.findLibrary("selenide").get())
}