package org.project.harry_potter.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import org.project.harry_potter.data.FavoriteHouse

@Dao
interface HouseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(favoriteHouse: FavoriteHouse)

    @Query("SELECT * FROM favorite_house WHERE id = 1")
    fun getFavoriteHouse(): Flow<FavoriteHouse?>
}