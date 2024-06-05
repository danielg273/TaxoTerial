package com.gzstudio.taxoterial.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.R
import com.gzstudio.taxoterial.navigation.ScreenAbout
import com.gzstudio.taxoterial.navigation.ScreenDominios
import com.gzstudio.taxoterial.navigation.ScreenQuiz
import com.gzstudio.taxoterial.navigation.ScreenReview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "TaxoTerial") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate(ScreenAbout)
            }) {
                Icon(Icons.Filled.Info, "Floating action button.")
            }
        }
    ) {innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxHeight(0.85f)
        ) {
            Button(
                onClick = { navController.navigate(ScreenReview) },
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Text(
                    text = "Repazo",
                    style = TextStyle.Default.copy(fontSize = 22.sp)
                )
            }

            Spacer(modifier = Modifier.size(16.dp))

            Button(
                onClick = { navController.navigate(ScreenDominios) },
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Text(
                    text = "Arbol Filogenetico",
                    style = TextStyle.Default.copy(fontSize = 22.sp)
                )
            }

            Spacer(modifier = Modifier.size(16.dp))

            Button(
                onClick = { navController.navigate(ScreenQuiz) },
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Text(
                    text = "Quiz",
                    style = TextStyle.Default.copy(fontSize = 22.sp)
                )
            }
        }
    }
}

