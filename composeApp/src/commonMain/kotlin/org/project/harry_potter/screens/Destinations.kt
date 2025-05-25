package org.project.harry_potter.screens

import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object CharacterList

@Serializable
data class CharacterDetails(val id: String)