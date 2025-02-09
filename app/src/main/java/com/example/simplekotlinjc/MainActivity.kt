package com.example.simplekotlinjc

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.GridView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplekotlinjc.ui.theme.SimpleKotlinJCTheme
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleKotlinJCTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding))


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var x = 0

    Column {
        Modifier
            .fillMaxWidth()
            .align(alignment = Alignment.End)


        Text(
            text = "Hello $name!",
           modifier = modifier

        )
        Button(onClick = {
            x++
         println("Hello  $x")
        }) {
            Modifier
                .fillMaxWidth()


                Text("Click Me")
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleKotlinJCTheme {
        Greeting("Android")
    }
}