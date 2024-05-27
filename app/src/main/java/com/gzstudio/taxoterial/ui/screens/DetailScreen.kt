@file:OptIn(ExperimentalMaterial3Api::class)

package com.gzstudio.taxoterial.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.data.DataProvider
import com.gzstudio.taxoterial.data.Dominio
import com.gzstudio.taxoterial.ui.ReinoCardItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(id: Int?, navController: NavController?) {

    val item = remember { DataProvider.dominioList }.find { it.id == id }
    val subItem = remember { DataProvider.reinoList }.filter { it.idDominio == id }

    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "${item?.title}") },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant
            ),
            navigationIcon = {
                IconButton(onClick = { navController?.popBackStack() }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                }
            }
        )
    }) {innerPadding ->

        Column(modifier = Modifier.padding(innerPadding)) {

            LazyColumn {
                item {
                    ItemInfo(dominio = item)
                    Spacer(modifier = Modifier.size(32.dp))
                    Text(
                        text = "Reinos:",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(16.dp)
                    )
                } 
                items(
                    items = subItem,
                    itemContent = {
                        ReinoCardItem(reino = it, navController = navController)
                    }
                )
                item {
                    Spacer(modifier = Modifier.size(64.dp))
                }
            }

        }

    }
}

@Composable
private fun ItemInfo(dominio: Dominio?) {
    if (dominio != null) {
        Image(
            painter = painterResource(id = dominio.dominioImageId),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 250.dp)
                .clip(RoundedCornerShape(bottomEnd = 16.dp, bottomStart = 16.dp)),
            contentScale = ContentScale.Crop
        )
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        if (dominio != null) {
            Text(
                text = dominio.title,
                style = MaterialTheme.typography.titleLarge
            )
        }
        Spacer(modifier = Modifier.size(32.dp))

        if (dominio != null) {
            Text(
                text = dominio.body,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
private fun DetailScreenPreview() {
    DetailScreen(id = null, navController = null)
}