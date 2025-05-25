package org.project.harry_potter.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.project.harry_potter.data.Character
import org.project.harry_potter.data.PotterRepository

class CharacterDetailsViewModel(private val potterRepository: PotterRepository) : ViewModel() {

    fun getCharacterById(characterId: String) = potterRepository.getCharacterById(characterId)

    fun setFavoriteCharacter(character: Character) = viewModelScope.launch {
        if (character.isFavorite) {
            potterRepository.removeFavoriteCharacter(character)
        } else {
            potterRepository.setFavoriteCharacter(character)
        }

    }
}