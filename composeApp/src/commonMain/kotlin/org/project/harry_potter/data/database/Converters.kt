package org.project.harry_potter.data.database

import androidx.room.TypeConverter
import org.project.harry_potter.data.Wand
import io.ktor.serialization.kotlinx.json.DefaultJson


class Converters {
    @TypeConverter
    fun fromStringList(value: List<String>?): String? {
        return value?.joinToString(separator = ",")
    }

    @TypeConverter
    fun toStringList(value: String?): List<String>? {
        return value?.split(',')?.map { it.trim() }
    }

    @TypeConverter
    fun fromWand(wand: Wand?): String? {
        return wand?.let { DefaultJson.encodeToString(it) }
    }

    @TypeConverter
    fun toWand(wandString: String?): Wand? {
        return wandString?.let { DefaultJson.decodeFromString<Wand>(it) }
    }

}