val version = rootProject.providers.gradleProperty("version").get()

repositories {
    mavenCentral()
    maven {
        name = 'sponge-repo'
        url = 'https://repo.spongepowered.org/repository/maven-public/'
    }
}

dependencies {
    implementation("org.spongepowered:spongeapi:" + version)
}
