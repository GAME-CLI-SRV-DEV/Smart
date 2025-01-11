val version = rootProject.providers.gradleProperty("version").get()

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
