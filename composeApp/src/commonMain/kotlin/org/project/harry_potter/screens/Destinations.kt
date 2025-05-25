package org.project.harry_potter.screens

import kotlinx.serialization.Serializable

@Serializable
object CharacterList

@Serializable
object StudentsList

@Serializable
object StaffList

@Serializable
object FavoritesList

@Serializable
data class CharacterDetails(val id: String)

@Serializable
object SpellsList