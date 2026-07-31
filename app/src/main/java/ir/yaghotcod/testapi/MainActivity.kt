package ir.yaghotcod.testapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ir.yaghotcod.testapi.ui.screen.SplashScreen
import ir.yaghotcod.testapi.ui.screen.UserListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "splash"
                    ) {
                        // صفحه اسپلش
                        composable("splash") {
                            SplashScreen(
                                onNavigateToHome = {
                                    // انتقال به صفحه لیست و حذف صفحه اسپلش از BackStack
                                    navController.navigate("user_list") {
                                        popUpTo("splash") { inclusive = true }
                                    }
                                }
                            )
                        }

                        // صفحه لیست کاربران
                        composable("user_list") {
                            UserListScreen()
                        }
                    }
                }
            }
        }
    }
}