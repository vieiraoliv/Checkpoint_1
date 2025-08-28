package com.example.checkpoint_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.checkpoint_1.ui.theme.Checkpoint_1Theme
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Checkpoint_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
,                       TextoCustomizado(
                            "primeira função composable",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    @Composable
    fun TextoCustomizado(texto: String, modifier: Modifier){
        Text(
            text = texto,
            modifier =  modifier.fillMaxSize()
        )
    }
}