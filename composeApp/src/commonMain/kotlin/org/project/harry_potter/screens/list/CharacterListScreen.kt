package org.project.harry_potter.screens.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import org.koin.compose.viewmodel.koinViewModel
import org.project.harry_potter.data.Character

@Composable
fun CharacterListScreen(onBackClick: () -> Unit) {
    val characterListViewModel = koinViewModel<CharacterListViewModel>()

    val characters by characterListViewModel.getAllCharacters().collectAsState(initial = emptyList())

    LazyColumn(modifier = Modifier.fillMaxSize()) {

        items(characters) { character ->
            Text(character.name)
        }

        item {
            Button(
                onClick =  onBackClick,
                content = { Text("Get All Characters") }
            )
        }

    }
}

@Composable
fun CharacterItem(character: Character) {

}