package linecraft.plavel.ui.main.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import linecraft.plavel.R

sealed class BottomNavigationScreen(
    val route: String,
    @DrawableRes val drawableResourceId: Int,
    @StringRes val stringResourceId: Int
) {
    object Home : BottomNavigationScreen(ROUTE_HOME, R.drawable.ic_home, R.string.home)
    object Community : BottomNavigationScreen(ROUTE_COMMUNITY, R.drawable.ic_community, R.string.community)
    object MyTravel : BottomNavigationScreen(ROUTE_MY_TRAVEL, R.drawable.ic_my_travel, R.string.myTravel)
    object MyPage : BottomNavigationScreen(ROUTE_MY_PAGE, R.drawable.ic_my_page, R.string.myPage)

    companion object {
        private const val ROUTE_HOME = "Home"
        private const val ROUTE_COMMUNITY = "Community"
        private const val ROUTE_MY_TRAVEL = "MyTravel"
        private const val ROUTE_MY_PAGE = "MyPage"
    }
}
