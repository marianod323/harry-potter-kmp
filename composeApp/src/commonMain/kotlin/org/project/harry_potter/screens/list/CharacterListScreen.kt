package org.project.harry_potter.screens.list

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import org.project.harry_potter.data.Character

@Composable
fun CharacterListScreen(characters: List<Character>, onCharacterClick: (Character) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(4.dp)) {
        item {
            AnimatedVisibility(characters.isEmpty()) {
                Box(Modifier.fillParentMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            }
        }

        items(characters) { character ->
            AnimatedVisibility(characters.isNotEmpty()) {
                CharacterItem(character, onCharacterClick)
                Spacer(Modifier.size(8.dp))
            }
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
                val actor = character.actor.ifEmpty { "-" }

                Text(character.name, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary, modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally))
                Text("Actor: $actor", style = TextStyle.Default)
            }
        }
    }
}