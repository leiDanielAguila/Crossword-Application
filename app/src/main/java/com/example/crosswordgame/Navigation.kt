package com.example.crosswordgame

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.games.MoviesScreen
import com.example.crosswordgame.mainMenu.MainMenuScreen
import com.example.crosswordgame.mainMenu.SettingsScreen
import com.example.crosswordgame.mainMenu.feedback.FeedbackScreen
import com.example.crosswordgame.mainMenu.feedback.FeedbackScreenThree
import com.example.crosswordgame.mainMenu.feedback.FeedbackScreenTwo
import com.example.crosswordgame.selectOptions.GameSelectionScreen
import com.example.crosswordgame.ui.theme.brown

@Composable
fun Navigation() {
    val navController = rememberNavController()
    Box(
        modifier = Modifier
            .background(brown)
    ) {
        NavHost(
            navController = navController, startDestination = Screen.MainMenu.route,
            enterTransition = { fadeIn(animationSpec = tween(2000, easing = LinearOutSlowInEasing)) },
            exitTransition = { fadeOut(animationSpec = tween(2000, easing = LinearOutSlowInEasing)) }
        ) {
            composable (route = Screen.MainMenu.route) { MainMenuScreen(navController = navController) }
            composable (route = Screen.Settings.route) { SettingsScreen(navController = navController) }
            composable(route = Screen.GameSelection.route) { GameSelectionScreen(navController = navController) }
            composable(route = Screen.Movies.route) { MoviesScreen(navController = navController) }

            // feedback screens
            composable(route = Screen.FeedbackOne.route) { FeedbackScreen(navController = navController) }
            composable(route = Screen.FeedbackTwo.route) { FeedbackScreenTwo(navController = navController) }
            composable(route = Screen.FeedbackThree.route) { FeedbackScreenThree(navController = navController) }
            // end of feedback screens


        }
    }
}