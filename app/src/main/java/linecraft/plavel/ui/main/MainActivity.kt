package linecraft.plavel.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import linecraft.plavel.ui.main.screens.MainScreenView
import linecraft.plavel.ui.theme.PlavelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlavelTheme {
                MainScreenView()
            }
        }
    }
}




