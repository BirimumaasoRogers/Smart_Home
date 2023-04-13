package com.example.smarthome.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.smarthome.screens.*
import com.example.smarthome.screens.favourites.FavouritesScreen
import com.example.smarthome.screens.favourites.SelectRoutine

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "favourites"){
        composable(route = "favourites"){
            FavouritesScreen(navController = navController)
        }
        composable(route = "things"){
            ThingsScreen()
        }
        composable(route = "routines"){
            RoutinesScreen()
        }
        composable(route = "ideas"){
            IdeasScreen()
        }
        composable(route = "settings"){
            SettingsScreen()
        }
        composable(route = "select_routine"){
            SelectRoutine(navController = navController)
        }
    }
}