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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.data.DataProvider
import com.gzstudio.taxoterial.data.Item
import com.gzstudio.taxoterial.ui.SmallItemCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(name: String, navController: NavController?) {

    val item = remember { DataProvider.itemLists }.find { it.name == name }
    val subItems = remember { DataProvider.itemLists }.filter { it.type == item?.child && it.parent == name}
//    val subItems


    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "${item?.name}") },
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
                    ItemInfo(item = item)
                    Spacer(modifier = Modifier.size(32.dp))
                    Text(
                        text = "${item?.child}s:",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(16.dp)
                    )
                } 
                items(
                    items = subItems,
                    itemContent = {
                        SmallItemCard(item = it, navController = navController )
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
private fun ItemInfo(item: Item?) {
    if (item != null) {
        Image(
            painter = painterResource(id = item.itemImageId!!),
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
        if (item != null) {
            Text(
                text = item.name,
                style = MaterialTheme.typography.titleLarge
            )
        }
        Spacer(modifier = Modifier.size(32.dp))

        if (item != null) {
            Text(
                text = item.body,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

//@Preview
//@Composable
//private fun DetailScreenPreview() {
//    DetailScreen(id = null, navController = null)
//}