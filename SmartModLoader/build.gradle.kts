dependencies {
    compileOnly(project(":Smart-BukkitAPI"))
    
}

tasks.processResources {
    val apiVersion = rootProject.providers.gradleProperty("mcVersion").get()
    val props = mapOf(
        "version" to rootProject.providers.gradleProperty("version").get(),
    )
    inputs.properties(props)
    filesMatching("plugin.yml") {
        expand(props)
    }
}
