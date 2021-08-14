package com.example.kotlin_class

data class Banco (
        val nome: String,
        val numero: Int
) {
    fun bancoInfo() = "$nome  $numero"
}