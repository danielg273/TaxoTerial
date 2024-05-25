@file:OptIn(ExperimentalMaterial3Api::class)

package com.gzstudio.taxoterial.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gzstudio.taxoterial.R

@Composable
fun DetailScreen(modifier: Modifier = Modifier) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Travis Scott") },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant
            ),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                }
            }
        )
    }) {innerPadding ->

        Column(modifier = Modifier.padding(innerPadding)) {
            Image(
                painter = painterResource(id = R.drawable.trav),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 250.dp)
                    .clip(RoundedCornerShape(bottomEnd = 16.dp, bottomStart = 16.dp)),
                contentScale = ContentScale.Crop
                )
            Text(
                text = "Travis Scott",
                style = MaterialTheme.typography.titleLarge
            )
        }

    }
}

@Preview
@Composable
private fun DetailScreenPreview() {
    DetailScreen()
}