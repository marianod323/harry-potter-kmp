package org.project.harry_potter.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.project.harry_potter.data.Character
import org.project.harry_potter.screens.list.CharacterListScreen

@Composable
fun FavoriteCharacters(characters: List<Character>?, onCharacterClick: (Character) -> Unit) {
    if (characters.isNullOrEmpty()) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "You still have no favorite characters.")
        }
    } else {
        CharacterListScreen(characters, onCharacterClick)

    }
}