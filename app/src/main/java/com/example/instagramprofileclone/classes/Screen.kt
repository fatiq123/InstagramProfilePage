package com.example.instagramprofileclone.classes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val image: ImageVector) {

    object Home: Screen("home", "Home", Icons.Outlined.Home)
    object Search: Screen("search", "Search", Icons.Outlined.Search)
    object Add: Screen("add", "Add", Icons.Outlined.AddCircleOutline)
    object Likes: Screen("like", "Likes", Icons.Outlined.FavoriteBorder)
    object Profile: Screen("profile", "Profile", Icons.Outlined.AccountCircle)


}
