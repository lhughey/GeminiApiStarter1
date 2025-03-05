package com.example.geminiapistarter1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun FreestyleScreen(navController: NavController) {

    //create a stack container
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Red)

    ) {

        Text("Hello, World!")

        //create a nav button to navigate to the baking screen
        Button(onClick = { navController.navigate("baking") }) {
            Text(text = "Go to Baking Screen")
        }
    }
}



