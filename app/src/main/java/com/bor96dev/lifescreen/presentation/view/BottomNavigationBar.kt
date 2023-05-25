package com.bor96dev.lifescreen.presentation.view

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Timer

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomNavigation {
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Calendar") },
            selected = navController.currentDestination?.route == "calendar",
            onClick = { navController.navigate("calendar") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Timer, contentDescription = "Countdown") },
            selected = navController.currentDestination?.route == "countdown",
            onClick = { navController.navigate("countdown") }
        )
    }
}