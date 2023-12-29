package com.example.waketransit.ui.component

import MainScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.waketransit.ui.screen.MapScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("mainScreen") { MainScreen(navController) }
        composable("mapScreen") { MapScreen(navController) }
    }
}