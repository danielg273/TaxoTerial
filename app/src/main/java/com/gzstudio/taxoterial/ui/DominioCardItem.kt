@file:OptIn(ExperimentalMaterial3Api::class)

package com.gzstudio.taxoterial.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.data.Dominio
import com.gzstudio.taxoterial.navigation.ScreenDetails

@Composable
fun DominioCardItem(dominio: Dominio, navController: NavController?) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        onClick = {
            navController?.navigate(ScreenDetails(id = dominio.id))
        },
        modifier = Modifier.padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ), shape = MaterialTheme.shapes.large
    ) {
        Image(
            painter = painterResource(id = dominio.dominioImageId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(MaterialTheme.shapes.large)
                .height(250.dp)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = dominio.title,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = dominio.body,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 4
            )
        }
    }
}