package org.project.harry_potter

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel
import org.project.harry_potter.data.FavoriteHouse
import org.project.harry_potter.data.House
import org.project.harry_potter.screens.CharacterDetails
import org.project.harry_potter.screens.CharacterList
import org.project.harry_potter.screens.FavoriteCharacters
import org.project.harry_potter.screens.FavoriteHouseViewModel
import org.project.harry_potter.screens.FavoritesList
import org.project.harry_potter.screens.SpellsList
import org.project.harry_potter.screens.StaffList
import org.project.harry_potter.screens.StudentsList
import org.project.harry_potter.screens.detail.CharacterDetailsScreen
import org.project.harry_potter.screens.list.CharacterListScreen
import org.project.harry_potter.screens.list.CharacterListViewModel
import org.project.harry_potter.screens.list.SpellListScreen
import org.project.harry_potter.screens.list.SpellListViewModel
import org.project.harry_potter.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    val favoriteHouseViewModel = koinViewModel<FavoriteHouseViewModel>(key = "singleton")

    val favorite by favoriteHouseViewModel.getFavoriteHouse().collectAsState(null)

    val favoriteHouse by remember(favorite) {
        mutableStateOf(
            when (favorite?.house) {
                House.GRYFFINDOR -> "gryffindor"
                House.SLYTHERIN -> "slytherin"
                House.RAVENCLAW -> "ravenclaw"
                House.HUFFLEPUFF -> "hufflepuff"
                else -> "gryffindor"
            }
        )
    }
    val navController = rememberNavController()

    AppTheme(house = favoriteHouse) {
        Scaffold(
            modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars.union(WindowInsets.navigationBars)),
            bottomBar = {
                BottomBar(
                    currentHouse = favoriteHouse,
                    onNavigateToFavorites = { navController.navigate(FavoritesList) },
                    onNavigateToAllCharacters = { navController.navigate(CharacterList) },
                    onNavigateToAllStaff = { navController.navigate(StaffList) },
                    onNavigateToAllStudents = { navController.navigate(StudentsList) },
                    onNavigateToSpells = { navController.navigate(SpellsList) },
                    onSelectHouse = { house ->
                        favoriteHouseViewModel.setFavoriteHouse(house)
                    }
                )
            }
        ) {
            NavHost(navController = navController, startDestination = CharacterList) {
                composable<CharacterList> {
                    val characterListViewModel = koinViewModel<CharacterListViewModel>()
                    val characters by characterListViewModel.getAllCharacters().collectAsState(initial = emptyList())

                    CharacterListScreen(characters) { character ->
                        navController.navigate(CharacterDetails(character.id))
                    }
                }

                composable<CharacterDetails> { backStackEntry ->
                    CharacterDetailsScreen(
                        characterId = backStackEntry.toRoute<CharacterDetails>().id,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable<StudentsList> {
                    val characterListViewModel = koinViewModel<CharacterListViewModel>()
                    val characters by characterListViewModel.getAllStudents().collectAsState(initial = emptyList())

                    CharacterListScreen(characters) { character ->
                        navController.navigate(CharacterDetails(character.id))
                    }
                }

                composable<StaffList> {
                    val characterListViewModel = koinViewModel<CharacterListViewModel>()
                    val characters by characterListViewModel.getAllStaff().collectAsState(initial = emptyList())

                    CharacterListScreen(characters) { character ->
                        navController.navigate(CharacterDetails(character.id))
                    }
                }

                composable<FavoritesList> {
                    val characterListViewModel = koinViewModel<CharacterListViewModel>()
                    val characters by characterListViewModel.getFavorites().collectAsState(initial = emptyList())

                    FavoriteCharacters(characters) { character ->
                        navController.navigate(CharacterDetails(character.id))
                    }
                }

                composable<SpellsList> {
                    val spellListViewModel = koinViewModel<SpellListViewModel>()
                    val spells by spellListViewModel.getAllSpells().collectAsState(initial = emptyList())

                    SpellListScreen(spells)
                }
            }
        }
    }
}

@Composable
fun BottomBar(
    currentHouse: String = "gryffindor",
    onNavigateToFavorites: () -> Unit = {},
    onNavigateToAllCharacters: () -> Unit = {},
    onNavigateToAllStaff: () -> Unit = {},
    onNavigateToAllStudents: () -> Unit = {},
    onNavigateToSpells: () -> Unit = {},
    onSelectHouse: (House) -> Unit = {},
) {
    val isDropDownMenuExpanded = remember { mutableStateOf(false) }

    LazyRow(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.height(80.dp).fillMaxWidth().background(color = MaterialTheme.colorScheme.onBackground).clickable{},
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        item {
            Button(onClick = { onNavigateToAllCharacters() }) {
                Text("Everyone")
            }

            Button(onClick = { onNavigateToAllStudents() }, Modifier.padding(start = 8.dp)) {
                Text("Students")
            }

            Button(onClick = { isDropDownMenuExpanded.value = !isDropDownMenuExpanded.value }, Modifier.padding(start = 8.dp)) {
                Text("Change house!")
                HouseSelectionMenu(isDropDownMenuExpanded, currentHouse, onSelectHouse)
            }

            Button(onClick = { onNavigateToAllStaff() }, Modifier.padding(start = 8.dp)) {
                Text("All Staff")
            }

            Button(onClick = { onNavigateToFavorites() }, Modifier.padding(start = 8.dp)) {
                Text("Favorites")
            }

            Button(onClick = { onNavigateToSpells() }, Modifier.padding(start = 8.dp)) {
                Text("Spells")
            }
        }
    }
}

@Composable
fun HouseSelectionMenu(
    isExpanded: MutableState<Boolean>,
    currentHouse: String,
    onSelectHouse: (House) -> Unit
) {
    val dropdownItemPosition = remember { mutableStateOf(0) }
    val houses = House.entries

    DropdownMenu(
        expanded = isExpanded.value,
        onDismissRequest = { isExpanded.value = false }
    ) {
        houses.forEachIndexed { index, house ->
            DropdownMenuItem(
                text = {
                    Row (verticalAlignment = Alignment.CenterVertically) {
                        Text(text = house.name)
                        if (currentHouse.uppercase() == house.name) {
                            Icon(Icons.Rounded.Check, contentDescription = null, modifier = Modifier.padding(start = 4.dp))
                        }
                    }
                },
                onClick = {
                    isExpanded.value = false
                    dropdownItemPosition.value = index
                    onSelectHouse(house)
                }

            )
        }
    }
}