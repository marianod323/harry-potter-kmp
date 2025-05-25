package org.project.harry_potter

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import harrypotterkmp.composeapp.generated.resources.Res
import harrypotterkmp.composeapp.generated.resources.compose_multiplatform
import org.project.harry_potter.screens.CharacterDetails
import org.project.harry_potter.screens.CharacterList
import org.project.harry_potter.screens.Home
import org.project.harry_potter.screens.detail.CharacterDetailsScreen
import org.project.harry_potter.screens.list.CharacterListScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = Home) {
                composable<Home> {
                    Home()
                }

                composable<CharacterList> {
                    CharacterListScreen()
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
fun Home() {
    var showContent by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
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