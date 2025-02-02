package org.laolittle.plugin

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object SkikoMirai : KotlinPlugin(
    JvmPluginDescription(
        id = "org.laolittle.plugin.SkikoMirai",
        name = "SkikoMirai",
        version = "1.0.2",
    ) {
        author("LaoLittle")
    }
) {
    override fun onEnable() {
        FontConfig.reload()
        logger.info { "Plugin loaded" }
    }
}