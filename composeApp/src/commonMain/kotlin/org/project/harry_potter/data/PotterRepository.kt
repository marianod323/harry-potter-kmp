package org.project.harry_potter.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import org.project.harry_potter.data.database.PotterDatabase

interface PotterRepository {
    fun getAllCharacters(): Flow<List<Character>>
    fun getCharacterById(id: String): Flow<Character>
    fun getCharactersByHouse(house: String): Flow<List<Character>>
    fun getAllStudents(): Flow<List<Character>>
    fun getAllStaff(): Flow<List<Character>>
    fun getAllSpells(): Flow<List<Spell>>
    suspend fun setFavoriteHouse(house: FavoriteHouse)
    fun getFavoriteHouse(): Flow<FavoriteHouse?>
}

class PotterRepositoryImpl(
    private val potterApi: PotterApi,
    private val database: PotterDatabase
): PotterRepository {
    override fun getAllCharacters(): Flow<List<Character>> = flow {
        emit(potterApi.getAllCharacters())
    }.catch {
        emit(emptyList())
    }

    override fun getCharacterById(id: String): Flow<Character> = flow {
        emit(potterApi.getCharacterById(id))
    }.catch {
        emit(Character())
    }

    override fun getCharactersByHouse(house: String): Flow<List<Character>> = flow {
        emit(potterApi.getCharactersByHouse(house))
    }.catch {
        emit(emptyList())
    }

    override fun getAllStudents(): Flow<List<Character>> = flow {
        emit(potterApi.getAllStudents())
    }.catch {
        emit(emptyList())
    }

    override fun getAllStaff(): Flow<List<Character>> = flow {
        emit(potterApi.getAllStaff())
    }.catch {
        emit(emptyList())
    }

    override fun getAllSpells(): Flow<List<Spell>> = flow {
        emit(potterApi.getAllSpells())
    }.catch {
        emit(emptyList())
    }

    override suspend fun setFavoriteHouse(house: FavoriteHouse) {
        database.houseDao().insert(house)
    }

    override fun getFavoriteHouse(): Flow<FavoriteHouse?> = flow {
        emit(database.houseDao().getFavoriteHouse())
    }.catch {
        emit(null)
    }

}