plugins {
    `java-library`
}

var libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

dependencies {
    api(libs.findLibrary("restAssured").get())
}