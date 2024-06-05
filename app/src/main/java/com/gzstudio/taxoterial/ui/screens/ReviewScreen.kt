package com.gzstudio.taxoterial.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReviewScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Taxonomía") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                ),
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) {innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .padding(32.dp)
        ) {
            Text(text = "La taxonomía es la ciencia que se dedica a la clasificación jerárquica de los organismos vivos. Es como un mapa de carreteras para el mundo natural, que nos ayuda a comprender la diversidad de la vida y las relaciones entre los diferentes grupos de seres vivos.",
                style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = "Los taxónomos utilizan una serie de características para clasificar a los organismos, como su estructura física, su fisiología, su comportamiento y su ADN. A medida que se descubren nuevas especies, se van añadiendo al sistema de clasificación, lo que lo convierte en una herramienta en constante evolución.",
                style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.size(16.dp))
            Text(text =  "La clasificación de los organismos se organiza en una jerarquía de niveles, cada uno de los cuales es más amplio que el anterior. Los niveles principales de la taxonomía son: Dominio, Reino, Filo, Clase, Orden, Familia, Género  y Especie.",
                style = MaterialTheme.typography.bodyLarge)
        }
    }
}