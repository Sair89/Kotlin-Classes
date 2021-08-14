package com.example.kotlin_class

abstract class Pessoa(
        val nome: String,
        val cpf: String
){

    fun pessoaInfo() = "$nome  $cpf"

}

