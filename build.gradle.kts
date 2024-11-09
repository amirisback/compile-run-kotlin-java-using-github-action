plugins {
    kotlin("jvm") version "2.0.21"
}

group = "io.github.amirisback"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

tasks.register ("runMainKotlin", JavaExec::class.java) {
    description = "Compile and Run Main Kotlin"
    classpath = sourceSets["main"].runtimeClasspath
    // note the addition of "Kt" on the end of the class name.

    mainClass.set("io.github.amirisback.MainKt")
}