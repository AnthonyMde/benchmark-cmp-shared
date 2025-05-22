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
include(":umbrella:data")
include(":umbrella:analytics")

project(":umbrella:data").projectDir = file("umbrella/data")
project(":umbrella:analytics").projectDir = file("umbrella/analytics")