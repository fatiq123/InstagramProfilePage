package com.example.instagramprofileclone.components

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.instagramprofileclone.classes.Screen

@Composable
fun InstagramBottomNavBar(navController: NavController) {
    val items = listOf(
        Screen.Home,
        Screen.Search,
        Screen.Add,
        Screen.Likes,
        Screen.Profile
    )

    BottomNavigation(
        modifier = Modifier.navigationBarsPadding(),
        backgroundColor = Color.White,
        elevation = 8.dp
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(screen.image, contentDescription = null) },
                label = { Text(screen.title) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        popUpTo(navController.graph.startDestinationId)
                        // Avoid multiple copies of the same destination when
                        // re-selecting the same item
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

