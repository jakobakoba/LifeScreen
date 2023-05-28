package com.bor96dev.lifescreen.presentation.view

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.bor96dev.lifescreen.presentation.viewmodel.CountdownViewModel

import com.bor96dev.lifescreen.presentation.viewmodel.UserViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NavGraph(navController: NavController, userViewModel: UserViewModel, countdownViewModel: CountdownViewModel) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold() {

        NavHost(navController = navController as NavHostController, startDestination = "calendar") {
            composable("calendar") { CalendarScreen() }
            composable("countdown") { CountdownScreen(countdownViewModel) }
        }
    }


}