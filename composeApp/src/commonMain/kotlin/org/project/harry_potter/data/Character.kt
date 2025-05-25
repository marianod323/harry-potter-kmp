package org.project.harry_potter.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val id: String = "-1",
    val name: String = "",
    @SerialName("alternate_names")
    val alternateNames: List<String> = emptyList(),
    val species: String = "",
    val house: String = "",
    val dateOfBirth: String = "",
    val yearOfBirth: Int = -1,
    @SerialName("wizard")
    val isWizard: Boolean = false,
    val ancestry: String = "",
    @SerialName("eyeColour")
    val eyeColor: String = "",
    @SerialName("hairColour")
    val hairColor: String = "",
    val wand: Wand = Wand(),
    val patronus: String = "",
    @SerialName("hogwartsStudent")
    val isHogwartsStudent: Boolean = false,
    @SerialName("hogwartsStaff")
    val isHogwartsStaff: Boolean = false,
    val actor: String = "",
    @SerialName("alternate_actors")
    val alternateActors: List<String> = emptyList(),
    @SerialName("alive")
    val isAlive: Boolean = false,
    val image: String = ""
)