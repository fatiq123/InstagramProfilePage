package com.example.instagramprofileclone.classes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class SettingsScreen(val route: String, val title: String, image: ImageVector) {

    object Settings: SettingsScreen("setting", "Setting", Icons.Outlined.Settings)
}
