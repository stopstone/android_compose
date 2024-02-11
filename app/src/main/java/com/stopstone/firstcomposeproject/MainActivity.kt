package com.stopstone.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stopstone.firstcomposeproject.ui.theme.FirstComposeProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Composable
fun UserGuidePopup() {
    Row {
        Button(modifier = Modifier.weight(1f), onClick = { /*TODO*/ }) {
            Text(text = "취소")
        }

        Button(modifier = Modifier.weight(2f), onClick = { /*TODO*/ }) {
            Text(text = "확인")
        }
    }
}

@Composable
fun SignInScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "One Market",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "로그인")
        }
    }
}


@Preview(
    name = "phone",
    group = "signIn",
    device = Devices.PHONE,
    showSystemUi = true,
    showBackground = true
)

@Preview(
    name = "tablet",
    group = "signIn",
    device = Devices.TABLET,
    showSystemUi = true,
    showBackground = true
)
@Composable
fun SignInScreenPreview() {
    SignInScreen()
}


@Preview
@Composable
fun UserGuidePopupPreview() {
    UserGuidePopup()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstComposeProjectTheme {
        Greeting("Android")
    }
}