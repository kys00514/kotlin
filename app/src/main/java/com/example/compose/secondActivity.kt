package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class secondActivity: ComponentActivity() {
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

                    }
                }
            }
        }
    }
    @Composable
    fun SimpleButton() {
        Button(onClick = {
            //your onclick code here
        }) {
            Text(text = "Simple Button")

        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!",
            modifier = Modifier
                .padding(120.dp,0.dp,120.dp,0.dp))

    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeTheme {
            Greeting("Android")
        }
    }
}