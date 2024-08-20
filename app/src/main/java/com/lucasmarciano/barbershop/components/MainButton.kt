package com.lucasmarciano.barbershop.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lucasmarciano.barbershop.models.ActionButton

@Composable
fun MainButton(modifier: Modifier = Modifier, action: ActionButton) {
    Button(onClick = { action.action }) {
        Text(text = action.text)
    }
}