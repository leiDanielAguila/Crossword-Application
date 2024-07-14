package com.example.crosswordgame

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.games.BackgroundMoviesImage
import com.example.crosswordgame.games.MoviesScreen
import com.example.crosswordgame.mainMenu.MainMenu
import com.example.crosswordgame.mainMenu.SettingsOptions
import com.example.crosswordgame.selectOptions.GameSelectionScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainMenu.route) {
        composable (route = Screen.MainMenu.route) {
            MainMenu(navController = navController)
        }
        composable (route = Screen.Settings.route) { 
            SettingsOptions(navController = navController)
        }
        composable(route = Screen.GameSelection.route) {
            GameSelectionScreen(navController = navController)
        }
        composable(route = Screen.Movies.route) {
            MoviesScreen(navController = navController)
        }
    }
}