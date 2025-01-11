val version = rootProject.providers.gradleProperty("Sponge").get()

repositories {
    mavenCentral()
    maven {
        name = 'sponge-repo'
        url = 'https://repo.spongepowered.org/repository/maven-snapshots/'
    }
}

dependencies {
    implementation("org.spongepowered:spongeapi:" + version)
}
