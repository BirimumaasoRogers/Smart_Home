package com.example.smarthome

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smarthome.screens.FavouritesScreen
import com.example.smarthome.screens.ThingsScreen
import com.example.smarthome.screens.IdeasScreen
import com.example.smarthome.screens.SettingsScreen
import com.example.smarthome.screens.RoutinesScreen
import com.example.smarthome.screens.BottomNavBar


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Scaffold (
                modifier = Modifier
                    .shadow(3.dp),
                bottomBar = {
                    BottomNavBar(
                        items = listOf(
                            BottomNavItem(
                                name = "Favourites",
                                route = "favourites",
                                icon = painterResource(R.drawable.star),
                            ),
                            BottomNavItem(
                                name = "Things",
                                route = "things",
                                icon = painterResource(R.drawable.things)
                            ),
                            BottomNavItem(
                                name = "Routines",
                                route = "routines",
                                icon = painterResource(R.drawable.routines)
                            ),
                            BottomNavItem(
                                name = "Ideas",
                                route = "ideas",
                                icon = painterResource(R.drawable.ideas)
                            ),
                            BottomNavItem(
                                name = "Settings",
                                route = "settings",
                                icon = painterResource(R.drawable.tune)
                            ),
                        ),
                        navController = navController,
                        onItemClick = {
                            navController.navigate(it.route)
                        }
                    )
                }
            ){
                Navigation(navController = navController)
            }
        }
    }
}

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "favourites"){
        composable(route = "favourites"){
            FavouritesScreen()
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
    }
}
