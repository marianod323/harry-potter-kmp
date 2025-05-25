package org.project.harry_potter.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.project.harry_potter.data.FavoriteHouse
import org.project.harry_potter.data.House
import org.project.harry_potter.data.PotterRepository

class FavoriteHouseViewModel(private val potterRepository: PotterRepository) : ViewModel() {

    fun setFavoriteHouse(house: House) = viewModelScope.launch {
        potterRepository.setFavoriteHouse(FavoriteHouse(house = house))
    }

    fun getFavoriteHouse() = potterRepository.getFavoriteHouse()

}