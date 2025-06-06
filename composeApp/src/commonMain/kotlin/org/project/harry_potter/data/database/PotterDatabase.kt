package org.project.harry_potter.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.room.TypeConverters
import org.project.harry_potter.data.Character
import org.project.harry_potter.data.FavoriteHouse

@Database(entities = [Character::class, FavoriteHouse::class], version = 1)
@TypeConverters(Converters::class)
abstract class PotterDatabase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao

    abstract fun houseDao(): HouseDao
}

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object AppDatabaseConstructor : RoomDatabaseConstructor<PotterDatabase> {
    override fun initialize(): PotterDatabase
}
