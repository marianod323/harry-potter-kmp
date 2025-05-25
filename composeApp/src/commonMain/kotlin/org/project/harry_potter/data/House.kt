package org.project.harry_potter.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
enum class House {
    GRYFFINDOR,
    SLYTHERIN,
    HUFFLEPUFF,
    RAVENCLAW
}

@Serializable
@Entity(tableName = "favorite_house")
data class FavoriteHouse (
    @PrimaryKey
    val id: Int = 1,
    val house: House? = null
)