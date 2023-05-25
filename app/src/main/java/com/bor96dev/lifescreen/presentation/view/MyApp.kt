package com.bor96dev.lifescreen.presentation.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bor96dev.lifescreen.presentation.viewmodel.UserViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            NavHost(navController = navController, startDestination = "calendar") {
                composable("calendar") { CalendarScreen() }
                composable("countdown") { CountdownScreen() }
            }
        }
    }
}
