package com.lucasmarciano.barbershop.models

data class ActionButton(
    val text: String,
    val accessibilityText: String = text,
    val action: (Any?) -> Unit,
    val isDisable: Boolean = false,
)
