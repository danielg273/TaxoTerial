package com.gzstudio.taxoterial.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


data class ToggleableInfo (
    val isSelected: Boolean,
    val text: String
)

@Composable
fun TrueFalseQuestion(question: String) {
    Column(Modifier.fillMaxWidth()) {
        Text(text = question, style = MaterialTheme.typography.bodyLarge)
        RadioButtons()
        Row {
            
        }
    }
}

@Composable
fun RadioButtons() {
    val radioButtons = remember {
        mutableStateListOf(
            ToggleableInfo(
                isSelected = false,
                text = "Verdadero"
            ),
            ToggleableInfo(
                isSelected = false,
                text = "Falso"
            )
        )
    }

    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
        radioButtons.forEachIndexed { index, info ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clickable {
                        radioButtons.replaceAll {
                            it.copy(
                                isSelected = it.text == info.text
                            )
                        }
                    }
                    .padding(end = 16.dp)
            ) {
                RadioButton(
                    selected = info.isSelected,
                    onClick = {
                        radioButtons.replaceAll {
                            it.copy(
                                isSelected = it.text == info.text
                            )
                        }
                    }
                )
                Text(text = info.text)
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//private fun TrueFalseQuestionPreview() {
//    TrueFalseQuestion(navController = null)
//}