package com.gzstudio.taxoterial.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gzstudio.taxoterial.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen() {
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
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Info, "Floating action button.")
            }
        }

    ) {innerPading ->
        Column(
            modifier = Modifier.padding(innerPading)) {
            LazyColumn {
                items(1) {
//                    ImageCard(
//                        image = R.drawable.trav,
//                        title = "Travis Scott",
//                        body = "Jacques Bermon Webster II, known professionally as Travis Scott, is an American rapper, singer, songwriter, and record producer. Throughout his career, Scott has achieved four number-one hits on the US Billboard Hot 100 chart, along with a total of over one hundred charting songs.",
//                        Modifier.padding(16.dp)
//                    )
                    ImageCard(
                        image = R.drawable.trav,
                        title = "Eukarya",
                        body = "Eukaryota o Eukarya es el dominio (o imperio) que incluye los organismos formados por células con núcleo verdadero. La castellanización adecuada del término es eucariota o eucarionte.",
                        Modifier.padding(16.dp)
                    )

                    Spacer(modifier = Modifier.size(16.dp))

                    ImageCard(
                        image = R.drawable.trav,
                        title = "Archaea",
                        body = "Gran grupo de microorganismos procariotas unicelulares que, al igual que las bacterias, no presentan núcleo (pero sí nucleolo) ni orgánulos membranosos internos, pero son fundamentalmente diferentes a estas, de tal manera que conforman su propio dominio o reino.",
                        Modifier.padding(16.dp)
                    )

                    Spacer(modifier = Modifier.size(16.dp))

                    ImageCard(
                        image = R.drawable.trav,
                        title = "Bacteria",
                        body = "Gran grupo de microorganismos procariotas unicelulares que, al igual que las bacterias, no presentan núcleo (pero sí nucleolo) ni orgánulos membranosos internos, pero son fundamentalmente diferentes a estas, de tal manera que conforman su propio dominio o reino.",
                        Modifier.padding(16.dp))

                    Spacer(modifier = Modifier.size(128.dp))
                }
                }


            }

    }
}

@Preview
@Composable
fun FirstScreenPreview() {
    FirstScreen()
}