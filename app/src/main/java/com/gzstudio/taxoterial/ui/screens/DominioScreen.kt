package com.gzstudio.taxoterial.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.data.DataProvider
import com.gzstudio.taxoterial.navigation.ScreenAbout
import com.gzstudio.taxoterial.ui.BigItemCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DominioScreen(navController: NavController) {
    val dominios = remember { DataProvider.itemLists }.filter { it.type == "Dominio" }

    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "Dominios") },
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
            modifier = Modifier.padding(innerPadding)) {
            LazyColumn {
                item {
                    Text(
                        text = "El sistema de tres dominios, propuesto por Carl Woese en 1977, clasifica a todos los organismos vivos en tres grupos principales: Bacteria, Archaea y Eukarya. Esta clasificación se basa en diferencias fundamentales en la estructura celular, el metabolismo y la genética entre estos grupos.",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(22.dp)
                    )
                }
                items(
                    items = dominios,
                    itemContent = {
                        BigItemCard(item = it, navController = navController)
                    }
                )
                item {
                    Spacer(modifier = Modifier.size(64.dp))
                }
            }

            }

    }
}
