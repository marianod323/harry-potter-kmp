package org.project.harry_potter.data

import kotlinx.serialization.Serializable

@Serializable
data class Wand(
    val wood: String = "",
    val core: String = "",
    val length: Double = 0.0
)
