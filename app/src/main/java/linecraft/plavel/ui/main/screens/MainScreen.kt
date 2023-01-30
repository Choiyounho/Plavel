package linecraft.plavel.ui.main.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import linecraft.plavel.ui.main.BottomBar
import linecraft.plavel.ui.main.navigation.NavigationGraph
import linecraft.plavel.ui.theme.PlavelTheme

@Composable
fun MainScreenView() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController) },
    ) {
        Box(Modifier.padding(it)) {
            NavigationGraph(navController = navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlavelTheme {
        MainScreenView()
    }
}
