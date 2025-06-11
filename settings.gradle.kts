enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "cmp-shared"
include(":umbrella")
include(":umbrella:core")
include(":umbrella:dataA")
include(":umbrella:dataB")

project(":umbrella:core").projectDir = file("umbrella/core")
project(":umbrella:dataA").projectDir = file("umbrella/dataA")
project(":umbrella:dataB").projectDir = file("umbrella/dataB")
