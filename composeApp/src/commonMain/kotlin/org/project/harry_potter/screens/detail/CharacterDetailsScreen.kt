package org.project.harry_potter.screens.detail

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import org.project.harry_potter.data.Character

@Composable
fun CharacterDetailsScreen(
    character: Character,
    onBackClick: () -> Unit,
    onSetFavorite: (Character) -> Unit
) {
    if (character.id == "-1") {
        AnimatedVisibility(true) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
    } else {
        AnimatedVisibility(true) {
            CharacterDetails(character, onBackClick, onSetFavorite)
        }
    }
}

@Composable
fun CharacterDetails(character: Character, onBackClick: () -> Unit, onSetFavorite: (Character) -> Unit) {

    var favoriteState by remember { mutableStateOf(character.isFavorite) }

    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(16.dp).fillMaxSize()) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = onBackClick) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
            }

            IconButton(
                onClick = {
                    favoriteState = !favoriteState
                    onSetFavorite(character)
                },
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Icon(
                    imageVector = if (favoriteState) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "Favorite"
                )
            }
        }

        Box(Modifier.size(180.dp).padding(12.dp)) {
            AsyncImage(
                model = character.image,
                contentDescription = character.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.aspectRatio(1f).fillMaxSize(),
            )
        }

        Text(character.name, fontSize = 32.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary, modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp))
        Text("Actor: " + character.actor.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("House: " + character.house.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Wand: " + character.wand.toString().ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Patronus: " + character.patronus.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Species: " + character.species.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Alternate Names: " + character.alternateNames.joinToString(", ").ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Date of Birth: " + character.dateOfBirth?.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Year of Birth: " + character.yearOfBirth.toString().ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Is Wizard: " + character.isWizard.toString(), fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Ancestry: " + character.ancestry.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Eye Color: " + character.eyeColor.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Hair Color: " + character.hairColor.ifEmpty { "-" }, fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
        Text("Is Alive: " + character.isAlive.toString(), fontSize = 20.sp, color = MaterialTheme.colorScheme.secondary, modifier = Modifier.fillMaxWidth())
    }
}