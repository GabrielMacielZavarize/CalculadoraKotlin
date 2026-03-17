package com.example.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme

val CorFundo        = Color(0xFF1C1C1E)   // Fundo escuro
val CorBotao        = Color(0xFF3A4A6B)   // Cor dos botões
val CorOperador = Color(0xFFFF9800)   // Cor para +, -, *, /
val CorEspecial = Color(0xFF8B0000)   // Cor para o C
val CorIgual    = Color(0xFF2C6E49)   // Cor para o =
val CorTexto        = Color(0xFFFFFFFF)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                CalculadoraApp()
            }
        }
    }
}


@Composable
fun CalculadoraApp() {

    // Column = empilha os elementos de cima para baixo
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(CorFundo)
            .padding(8.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Display(valor = "0")

        GradeDeBotoes()
    }
}


@Composable
fun Display(valor: String) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Text(
            text = valor,
            fontSize = 46.sp,
            fontWeight = FontWeight.Light,
            color = CorTexto,
            textAlign = TextAlign.End,
            maxLines = 1
        )
    }
}

@Composable
fun GradeDeBotoes() {

    val linhas = listOf(
        listOf("7", "8", "9", "/"),
        listOf("4", "5", "6", "*"),
        listOf("1", "2", "3", "-"),
        listOf("0", "C", "=", "+")
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Para cada linha, cria uma Row
        for (linha in linhas) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)  // Espaço entre os botões
            ) {
                // Para cada botão dentro da linha
                for (rotulo in linha) {
                    BotaoCalculadora(
                        rotulo = rotulo,
                        modifier = Modifier.weight(1f)   // Todos os botões com o mesmo tamanho
                    )
                }
            }
        }
    }
}

@Composable
fun BotaoCalculadora(
    rotulo: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { /* A lógica vai aqui depois! */ },
        modifier = modifier
            .height(160.dp),
        shape = RoundedCornerShape(36.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = when (rotulo) {
                "+", "-", "*", "/" -> CorOperador
                "C"                -> CorEspecial
                "="                -> CorIgual
                else               -> CorBotao
            },
            contentColor = CorTexto
        )
    ) {
        Text(
            text = rotulo,
            fontSize = 26.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCalculadora() {
    CalculadoraApp()
}