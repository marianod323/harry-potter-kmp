package org.project.harry_potter.screens.list

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.project.harry_potter.data.Spell

@Composable
fun SpellListScreen(spells: List<Spell>) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(4.dp)) {
        item {
            AnimatedVisibility(spells.isEmpty()) {
                Box(Modifier.fillParentMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            }
        }

        items(spells) { spell ->
            AnimatedVisibility(spells.isNotEmpty()) {
                SpellItem(spell)
                Spacer(Modifier.size(8.dp))
            }
        }
    }
}


@Composable
fun SpellItem(spell: Spell) {
    Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        Row {
            Column(Modifier.fillMaxHeight().align(Alignment.CenterVertically).padding(12.dp)) {
                val description = spell.description.ifEmpty { "-" }

                Text(spell.name, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary, modifier = Modifier.fillMaxWidth().align(
                    Alignment.CenterHorizontally).padding(bottom = 4.dp))
                Text("Spell description: $description", style = TextStyle.Default)
            }
        }
    }
}