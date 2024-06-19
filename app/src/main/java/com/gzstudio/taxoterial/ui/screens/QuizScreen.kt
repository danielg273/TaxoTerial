package com.gzstudio.taxoterial.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gzstudio.taxoterial.data.QuestionsProvider

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(navController: NavController?) {
    val questions = remember { QuestionsProvider.questionList }
    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<Boolean?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var showQuestion by remember { mutableStateOf(true) }

    val question = questions[currentQuestion]

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Quiz") },
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
        }) { innerPadding ->

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.75f)
                .padding(innerPadding)
                .padding(32.dp)
        ) {
//            TrueFalseQuestion(question = "El dominio es dfsnko más alto dentro del sistema de tres dominios?")
//            Spacer(modifier = Modifier.height(16.dp))
//            TrueFalseQuestion(question = "El orden va despues de el genero?")

            if (showQuestion) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = question.question,
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                    ) {
                        Button(
                            onClick = { selectedAnswer = true },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Verdadero")
                        }
                        Spacer(modifier = Modifier.weight(0.3f))
                        Button(
                            onClick = { selectedAnswer = false },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Falso")
                        }
                    }


                    if (selectedAnswer != null) {
                        val isCorrect = selectedAnswer == question.isCorrect
                        score += if (isCorrect) 1 else 0
                        selectedAnswer = null

                        if (currentQuestion < questions.lastIndex) {
                            currentQuestion++
                        } else {
                            // Mostrar pantalla de resultados
//                        ResultsScreen(score, questions.size)
                            showQuestion = false
                            showResult = true
                        }
                    }

                }
            }

            if (showResult) {
                ResultsScreen(score = score, totalQuestions = questions.size)
            }


        }
    }
}


@Composable
fun ResultsScreen(score: Int, totalQuestions: Int) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
//        Image(
//            painterResource(id = R.drawable.trav),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .height(300.dp)
//                .width(300.dp)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Tuviste $score aciertos de $totalQuestions preguntas",
            fontSize = 18.sp
        )
        // Botón para reiniciar el quiz
    }
}
