buildscript {
    val kotlin_version by extra("1.7.20")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        classpath(libs.dagger.hilt.android.gradle.plugin)
        classpath(libs.kotlin.serialization)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

plugins {
    val kotlinVersion = "1.7.20"
    val agpVersion = "7.3.1"
    id("com.android.application") version agpVersion apply false
    id("com.android.library") version agpVersion apply false
    id("com.android.test") version agpVersion apply false
    id("org.jetbrains.kotlin.android") version kotlinVersion apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}