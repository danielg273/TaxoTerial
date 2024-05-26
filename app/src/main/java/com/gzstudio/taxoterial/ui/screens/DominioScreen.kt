package com.gzstudio.taxoterial.ui.screens

import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.data.DataProvider
import com.gzstudio.taxoterial.ui.DominioCardItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DominioScreen(navController: NavController?) {
    val dominios = remember { DataProvider.dominioList }
    val context = LocalContext.current

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
                Toast.makeText(context, "Aplicacion creada por Daniel Gutierrez Zamora", Toast.LENGTH_LONG).show()
            }) {
                Icon(Icons.Filled.Info, "Floating action button.")
            }
        }

    ) {innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)) {
            LazyColumn {
                item {
                    Text(text = "Los dominios son...", style = MaterialTheme.typography.bodyLarge)
                }
                items(
                    items = dominios,
                    itemContent = {
                        DominioCardItem(dominio = it, navController = navController)
                    }
                )
                item {
                    Spacer(modifier = Modifier.size(64.dp))
                }
            }

            }

    }
}

@Preview
@Composable
private fun FirstScreenPreview() {
    DominioScreen(navController = null)
}