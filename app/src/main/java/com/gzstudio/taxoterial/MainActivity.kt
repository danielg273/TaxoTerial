package com.gzstudio.taxoterial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.gzstudio.taxoterial.navigation.ScreenAbout
import com.gzstudio.taxoterial.navigation.ScreenDetails
import com.gzstudio.taxoterial.navigation.ScreenDominios
import com.gzstudio.taxoterial.ui.screens.AboutScreen
import com.gzstudio.taxoterial.ui.screens.DetailScreen
import com.gzstudio.taxoterial.ui.screens.DominioScreen
import com.gzstudio.taxoterial.ui.theme.TaxoTerialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaxoTerialTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = ScreenDominios) {
                    composable<ScreenDominios> {
                        DominioScreen(navController)
                    }
                    composable<ScreenDetails> {
                        val args = it.toRoute<ScreenDetails>()
                        DetailScreen(name = args.name, navController = navController)
                    }
                    composable<ScreenAbout> {
                        AboutScreen(navController = navController)
                    }
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaxoTerialTheme {
//        Greeting("Android")
    }
}