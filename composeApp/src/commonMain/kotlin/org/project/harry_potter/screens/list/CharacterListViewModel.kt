package org.project.harry_potter.screens.list

import androidx.lifecycle.ViewModel
import org.project.harry_potter.data.PotterRepository

class CharacterListViewModel(private val potterRepository: PotterRepository): ViewModel() {

    fun getAllCharacters() = potterRepository.getAllCharacters()

    fun getAllStudents() = potterRepository.getAllStudents()

    fun getAllStaff() = potterRepository.getAllStaff()

    fun getFavorites() = potterRepository.getFavoriteCharacters()
}