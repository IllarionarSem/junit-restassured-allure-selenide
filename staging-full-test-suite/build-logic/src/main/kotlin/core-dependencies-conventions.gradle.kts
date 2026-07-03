plugins {
    `java-library`
}

var libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

dependencies {
    api(libs.findLibrary("ownerConfigManager").get())
    api(libs.findLibrary("junit").get())
}