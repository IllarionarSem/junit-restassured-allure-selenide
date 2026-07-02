plugins {
    java
}

var libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

dependencies {
    implementation(libs.findLibrary("allure").get())

    compileOnly(libs.findLibrary("lombok").get())
    annotationProcessor(libs.findLibrary("lombok").get())

    testCompileOnly(libs.findLibrary("lombok").get())
    testAnnotationProcessor(libs.findLibrary("lombok").get())

    testRuntimeOnly(libs.findLibrary("slf4jSimple").get())
    testRuntimeOnly(libs.findLibrary("logbackClassic").get())
}