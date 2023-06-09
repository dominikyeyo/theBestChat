package com.diegonunez.chatkata.ui.navigation

import android.content.Intent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.diegonunez.chatkata.ui.activity.LoginActivity
import com.diegonunez.chatkata.ui.theme.AnimatedSplashScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {

            context.startActivity(Intent(context, LoginActivity::class.java))

            /*
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                BottomNav()
            }
            */
        }

            /*
            Box(modifier = Modifier.fillMaxSize()){
                Text("Welcome Chats")
            }
            */
        composable(route = Screen.Profile.route) {

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
               // BottomNav()
            }

        /*
            ProfileScreen(navController = navController)
            Box(modifier = Modifier.fillMaxSize()){
                Text("Welcome Chats")
            }
            */


        }
    }
}