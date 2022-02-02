@file: Suppress("unused")

package org.laolittle.plugin

import net.mamoe.mirai.utils.ExternalResource.Companion.toExternalResource
import org.jetbrains.skia.EncodedImageFormat
import org.jetbrains.skia.Surface

fun Surface.getBytes(format: EncodedImageFormat = EncodedImageFormat.PNG): ByteArray {
    makeImageSnapshot().encodeToData(format).use {
        requireNotNull(it) { "Error: Draw Failed" }
        return it.bytes
    }
}

fun Surface.toExternalResource(format: EncodedImageFormat = EncodedImageFormat.PNG) =
    getBytes(format).toExternalResource(format.name.replace("JPEG", "JPG"))
