version = "0.1" // Plugin version. Increment this to trigger the updater
description = "StupidTestCommanUwu😎😎😎" // Plugin description that will be shown to user

aliucord {
    // Changelog of your plugin
    changelog.set("""
        added sussy nothing
    """.trimIndent())
    // Image or Gif that will be shown at the top of your changelog page
    changelogMedia.set("https://cdn.discordapp.com/attachments/943744396002721802/1008453775985487963/Real_Michiru_Spin.gif?size=4096")

    // Add additional authors to this plugin
    // author("Name", 0)
    // author("Name", 0)

    // Excludes this plugin from the updater, meaning it won't show up for users.
    // Set this if the plugin is unfinished
    excludeFromUpdaterJson.set(true)
}
