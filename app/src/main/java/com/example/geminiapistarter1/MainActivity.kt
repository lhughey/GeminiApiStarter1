package com.example.geminiapistarter1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.geminiapistarter1.ui.theme.GeminiApiStarter1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeminiApiStarter1Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "baking") {
                    composable("baking") { BakingScreen(navController) }
                    composable("freestyle") { FreestyleScreen(navController) }
                }
            }
        }
    }
}