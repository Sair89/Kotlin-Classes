package com.example.kotlin_class.testes

import com.example.kotlin_class.Cliente
import com.example.kotlin_class.ClienteTipo

fun main() {

    val eduardo = Cliente(
            nome = "Eduardo Avilez",
            cpf = "123.123.123-23",
            tipoCliente = ClienteTipo.PF,
            senha = "123456"
    )

    println(eduardo)

    Autenticacao().autentica(eduardo)
}