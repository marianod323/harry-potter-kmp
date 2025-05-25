package org.project.harry_potter.screens.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.NoPhotography
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import org.koin.compose.viewmodel.koinViewModel
import org.project.harry_potter.data.Character

@Composable
fun CharacterListScreen(onCharacterClick: (Character) -> Unit) {
    val characterListViewModel = koinViewModel<CharacterListViewModel>()

    val characters by characterListViewModel.getAllCharacters().collectAsState(initial = emptyList())

    LazyColumn(modifier = Modifier.fillMaxSize().padding(4.dp)) {
        items(characters) { character ->
            CharacterItem(character, onCharacterClick)
            Spacer(Modifier.size(8.dp))
        }
    }
}

@Composable
fun CharacterItem(character: Character, onCharacterClick: (Character) -> Unit) {
    Card(onClick = { onCharacterClick(character) }, modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        Row {
            Box(Modifier.size(120.dp).padding(12.dp)) {
                if (character.image.isEmpty()) {
                    Icon(Icons.Rounded.NoPhotography, modifier = Modifier.fillMaxSize(), contentDescription = character.name)
                } else {
                    AsyncImage(
                        model = character.image,
                        contentDescription = character.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.aspectRatio(1f).fillMaxSize().clip(CircleShape),
                    )
                }
            }


            Column(Modifier.fillMaxHeight().align(Alignment.CenterVertically)) {
                val isWizard = if (character.isWizard) "Wizard" else "Not Wizard!"
                val actor = character.actor.ifEmpty { "-" }

                Text(character.name, style = TextStyle.Default)
                Text("Is it a Wizard? $isWizard", style = TextStyle.Default)
                Text("Actor: $actor", style = TextStyle.Default)
            }
        }
    }
}