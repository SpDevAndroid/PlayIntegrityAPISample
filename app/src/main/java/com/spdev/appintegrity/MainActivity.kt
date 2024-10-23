package com.spdev.appintegrity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spdev.appintegrity.ui.theme.AppIntegrityAPISampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppIntegrityAPISampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ViewStartPlayIntegrityFlow(
                        name = "User",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ViewStartPlayIntegrityFlow(name: String, modifier: Modifier = Modifier) {
    val modifierSubtitle = Modifier.padding(16.dp)
    modifierSubtitle.size(width = 300.dp, height = 100.dp)
    modifierSubtitle.background(Color.Green)
    Column {
        Spacer(modifier = Modifier.size(100.dp))
        Text(
            text = "Hello $name",
            modifier = modifier,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Spacer(modifier = Modifier.size(100.dp))
        Text(
            text = "Click here to get play integrity verdict",
            modifier = modifierSubtitle,
            textAlign = TextAlign.Center,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppIntegrityAPISampleTheme {
        ViewStartPlayIntegrityFlow(name = "Android")
    }
}