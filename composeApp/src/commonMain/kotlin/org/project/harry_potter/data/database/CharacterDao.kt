package org.project.harry_potter.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import org.project.harry_potter.data.Character

@Dao
interface CharacterDao {
    @Insert
    suspend fun insert(character: Character)

    @Query("SELECT * FROM favorite_characters")
    suspend fun getAllCharacters(): List<Character>

    @Delete
    suspend fun delete(character: Character)
}