package com.example.compose

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.compose.ui.theme.ComposeTheme
import java.security.KeyStore.TrustedCertificateEntry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                Column {
                    Greeting("Android")
                    SimpleButton()
                    SimpleButton()
                    Row(modifier=Modifier.horizontalScroll(rememberScrollState(0))){
                        Greeting("asdf")
                        SimpleButton()
                        Greeting("ddddd")

                    }
                }
                }
            }
        }
    }
}

@Composable
fun SimpleButton() {
    val context = LocalContext.current
    Button(onClick = {
        context.startActivity(Intent(context, secondActivity::class.java))
    }) {
        Text(text = "Simple Button")

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
            modifier = Modifier
            .padding(120.dp,15.dp,120.dp,15.dp))

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting("Android")
    }
}