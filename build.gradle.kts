

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.1" apply false
    id("com.android.library") version "7.4.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}
buildscript {
    repositories {
        // Define repositories for resolving dependencies
        mavenCentral()
    }
    dependencies {
            classpath("com.android.tools.build:gradle:3.2.0")

    }
}


tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}
