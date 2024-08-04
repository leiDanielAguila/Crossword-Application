package com.example.crosswordgame

sealed class Screen(val route: String) {
    data object MainMenu: Screen("Main_Menu")
    data object Settings: Screen("Settings")
    data object GameSelection: Screen("GameSelect")
    data object Movies: Screen("Movies")
    data object FeedbackOne: Screen("FeedbackOne")
    data object FeedbackTwo: Screen("FeedbackTwo")
}