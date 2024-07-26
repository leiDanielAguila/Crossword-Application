package com.example.crosswordgame

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.games.MoviesScreen
import com.example.crosswordgame.mainMenu.MainMenuScreen
import com.example.crosswordgame.mainMenu.SettingsScreen
import com.example.crosswordgame.selectOptions.GameSelectionScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainMenu.route) {
        composable (route = Screen.MainMenu.route) {
            MainMenuScreen(navController = navController)
        }
        composable (route = Screen.Settings.route) { 
            SettingsScreen(navController = navController)
        }
        composable(route = Screen.GameSelection.route) {
            GameSelectionScreen(navController = navController)
        }
        composable(route = Screen.Movies.route) {
            MoviesScreen(navController = navController)
        }
        composable(route = Screen.FeedbackOne.route) {

        }
    }
}