package org.project.harry_potter.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface PotterApi {
    suspend fun getAllCharacters(): List<Character>
    suspend fun getCharacterById(id: String): Character
    suspend fun getCharactersByHouse(house: String): List<Character>
    suspend fun getAllStudents(): List<Character>
    suspend fun getAllStaff(): List<Character>
    suspend fun getAllSpells(): List<Spell>
}

class PotterApiImpl(private val client: HttpClient) : PotterApi {
    companion object {
        const val BASE_URL = "https://hp-api.onrender.com/api"
    }

    override suspend fun getAllCharacters(): List<Character> {
        return try {
            client.get("$BASE_URL/characters").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    override suspend fun getCharacterById(id: String): Character {
        return try {
            client.get("$BASE_URL/character/$id").body<List<Character>>().first()
        } catch (e: Exception) {
            e.printStackTrace()
            Character()
        }
    }

    override suspend fun getCharactersByHouse(house: String): List<Character> {
        return try {
            client.get("$BASE_URL/characters/house/$house").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    override suspend fun getAllStudents(): List<Character> {
        return try {
            client.get("$BASE_URL/characters/students").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    override suspend fun getAllStaff(): List<Character> {
        return try {
            client.get("$BASE_URL/characters/staff").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }

    override suspend fun getAllSpells(): List<Spell> {
        return try {
            client.get("$BASE_URL/spells").body()
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }
}