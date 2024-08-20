package com.lucasmarciano.barbershop.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

        TextField(value = "", onValueChange = {})
        TextField(value = "", onValueChange = {})
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Entrar")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Cadastrar")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Esqueci minha senha")
        }
    }
}

@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}
