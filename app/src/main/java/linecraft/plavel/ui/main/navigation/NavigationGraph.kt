package linecraft.plavel.ui.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import linecraft.plavel.ui.main.screens.CommunityScreen
import linecraft.plavel.ui.main.screens.HomeScreen
import linecraft.plavel.ui.main.screens.MyPageScreen
import linecraft.plavel.ui.main.screens.MyTravelScreen


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavigationScreen.Home.route) {
        composable(BottomNavigationScreen.Home.route) {
            HomeScreen()
        }
        composable(BottomNavigationScreen.Community.route) {
            CommunityScreen()
        }
        composable(BottomNavigationScreen.MyTravel.route) {
            MyTravelScreen()
        }
        composable(BottomNavigationScreen.MyPage.route) {
            MyPageScreen()
        }
    }
}
