package org.project.harry_potter.screens.list

import androidx.lifecycle.ViewModel
import org.project.harry_potter.data.PotterRepository

class SpellListViewModel(private val potterRepository: PotterRepository): ViewModel() {
    fun getAllSpells() = potterRepository.getAllSpells()
}