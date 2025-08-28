package com.example.checkpoint_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.checkpoint_1.ui.theme.Checkpoint_1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Checkpoint_1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NotificationBage(Modifier.padding(innerPadding))
                }
            }
        }
    }
    @Composable
    fun Inicial(modifier: Modifier = Modifier) {
        Column(modifier = modifier.background(color=Color.Blue))  {
            TextoCustomizado("Primeira função composable")
            Row {
                TextoCustomizado("Seja bem vindo")
                TextoCustomizado("Olá usuário")
            }
        }
    }

    @Composable
    fun TextoCustomizado(texto: String, modifier: Modifier = Modifier){
        Text(
            text = texto,
            modifier =  modifier,
            color = Color.White


            )
    }
    @Composable
    fun NotificationBage(modifier: Modifier = Modifier) {
        Box(modifier = modifier.padding(16.dp), contentAlignment = Alignment.Center) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
                    .background(color = Color.Green)
            )
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(color = Color.Red)
                    .align(Alignment.TopEnd)
            )
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewFuncaoInicial() {
        Checkpoint_1Theme {
            Inicial()
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun PreviewNotificationBage() {
        Checkpoint_1Theme{
            NotificationBage()
        }
    }
}