package com.example.kotlin_class.testes

import com.example.kotlin_class.Analista
import com.example.kotlin_class.Funcionario
import com.example.kotlin_class.ImprimeRelatorioFuncionario

fun main(){

    val sair = Analista(nome = "Sair Colorado", cpf = "123456789", salario = 33800.0)

    ImprimeRelatorioFuncionario.imprime(sair)

}

