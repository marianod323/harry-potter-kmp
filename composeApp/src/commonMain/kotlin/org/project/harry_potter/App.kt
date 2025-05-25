package org.project.harry_potter

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import harrypotterkmp.composeapp.generated.resources.Res
import harrypotterkmp.composeapp.generated.resources.compose_multiplatform
import org.koin.compose.viewmodel.koinViewModel
import org.project.harry_potter.data.House
import org.project.harry_potter.screens.CharacterDetails
import org.project.harry_potter.screens.CharacterList
import org.project.harry_potter.screens.FavoriteHouseViewModel
import org.project.harry_potter.screens.Home
import org.project.harry_potter.screens.detail.CharacterDetailsScreen
import org.project.harry_potter.screens.list.CharacterListScreen
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
                else -> "slytherin"
            }
        )
    }

    AppTheme(house = favoriteHouse) {
        Surface(modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars.union(WindowInsets.navigationBars))) {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Home) {
                composable<Home> {
                    Home(navController)
                }

                composable<CharacterList> {
                    CharacterListScreen(
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable<CharacterDetails> { backStackEntry ->
                    CharacterDetailsScreen(
                        characterId = backStackEntry.toRoute<CharacterDetails>().id,
                        onBackClick = { navController.popBackStack() }
                    )
                }
            }
        }



    }
}

@Composable
fun Home(navController: NavController) {
    var showContent by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(CharacterList) }) {
            Text("go to list")
        }
        Button(onClick = { showContent = !showContent }) {
            Text("Click me!")
        }
        AnimatedVisibility(showContent) {
            val greeting = remember { Greeting().greet() }
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painterResource(Res.drawable.compose_multiplatform), null)
                Text("Compose: $greeting")
            }
        }
    }
}