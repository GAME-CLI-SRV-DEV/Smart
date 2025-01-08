pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "ApproximasterSmartServer2004"

// include("Smart-API") // Seperate API. The API Will Be Seperated if the Smart-API is Complete.
include("Smart-BukkitAPI") // an Official Name For Legacy API Updates.
// include("Smart-PaperAPI") // In case PaperMC Split.
include("Smart-Server") // The Server File. 
