package ir.yaghotcod.testapi.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.yaghotcod.testapi.utils.isInternetAvailable
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigateToHome: () -> Unit
) {
    val context = LocalContext.current
    var isConnected by remember { mutableStateOf(true) }
    var isLoading by remember { mutableStateOf(true) }

    // متد بررسی وضعیت اینترنت و تلاش مجدد
    fun checkConnectionAndNavigate() {
        isLoading = true
        if (isInternetAvailable(context)) {
            isConnected = true
            isLoading = false
            onNavigateToHome() // هدایت به صفحه اصلی در صورت اتصال
        } else {
            isConnected = false
            isLoading = false
        }
    }

    // بررسی اولیه اینترنت به محض باز شدن صفحه
    LaunchedEffect(Unit) {
        delay(1500) // تاخیر کوتاه برای نمایش لوگو یا نام برنامه
        checkConnectionAndNavigate()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // نام یا عنوان برنامه
        Text(
            text = "User Manager App",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(48.dp))

        if (isLoading) {
            // در حال بررسی اینترنت
            CircularProgressIndicator(
                modifier = Modifier.size(48.dp),
                color = MaterialTheme.colorScheme.primary
            )
        } else if (!isConnected) {
            // در صورت عدم اتصال به اینترنت: آیکون رفرش + متن قرمز
            IconButton(
                onClick = { checkConnectionAndNavigate() },
                modifier = Modifier.size(56.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Refresh,
                    contentDescription = "تلاش مجدد",
                    tint = MaterialTheme.colorScheme.error,
                    modifier = Modifier.size(40.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "اینترنت را وصل کنید یا تلاش مجدد کنید",
                color = Color.Red,
                fontSize = 16.sp
            )
        }
    }
}