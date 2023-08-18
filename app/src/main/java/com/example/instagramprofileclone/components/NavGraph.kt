package com.example.instagramprofileclone.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instagramprofileclone.classes.Screen
import com.example.instagramprofileclone.classes.SettingsScreen

@Composable
fun NavGraph(startDestination: String = Screen.Home.route) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.Home.route) { /* Home Composable */ }
        composable(Screen.Search.route) { /* Search Composable */ }
        composable(Screen.Add.route) { /* Add Composable */ }
        composable(Screen.Likes.route) { /* Likes Composable */ }
        composable(Screen.Profile.route) { /* Profile Composable */ }
        composable(SettingsScreen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }

    InstagramBottomNavBar(navController)
}