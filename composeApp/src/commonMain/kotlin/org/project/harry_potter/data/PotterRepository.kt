package org.project.harry_potter.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

class PotterRepository(
    private val potterApi: PotterApi
) {
    fun getAllCharacters(): Flow<List<Character>> = flow {
        emit(potterApi.getAllCharacters())
    }.catch {
        emit(emptyList())
    }

    fun getCharacterById(id: String): Flow<Character> = flow {
        emit(potterApi.getCharacterById(id))
    }.catch {
        emit(Character())
    }

    fun getCharactersByHouse(house: String): Flow<List<Character>> = flow {
        emit(potterApi.getCharactersByHouse(house))
    }.catch {
        emit(emptyList())
    }

    fun getAllStudents(): Flow<List<Character>> = flow {
        emit(potterApi.getAllStudents())
    }.catch {
        emit(emptyList())
    }

    fun getAllStaff(): Flow<List<Character>> = flow {
        emit(potterApi.getAllStaff())
    }.catch {
        emit(emptyList())
    }

    fun getAllSpells(): Flow<List<Spell>> = flow {
        emit(potterApi.getAllSpells())
    }.catch {
        emit(emptyList())
    }
}