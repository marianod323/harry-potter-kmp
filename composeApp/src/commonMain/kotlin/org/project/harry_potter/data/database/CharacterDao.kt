package org.project.harry_potter.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import org.project.harry_potter.data.Character

@Dao
interface CharacterDao {
    @Insert
    suspend fun insert(character: Character)

    @Query("SELECT * FROM favorite_characters")
    fun getAllCharacters(): Flow<List<Character>>

    @Delete
    suspend fun delete(character: Character)
}