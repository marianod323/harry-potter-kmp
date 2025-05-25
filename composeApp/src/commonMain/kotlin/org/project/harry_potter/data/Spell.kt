package org.project.harry_potter.data

import kotlinx.serialization.Serializable

@Serializable
data class Spell(
    val id: String,
    val name: String,
    val description: String
)
