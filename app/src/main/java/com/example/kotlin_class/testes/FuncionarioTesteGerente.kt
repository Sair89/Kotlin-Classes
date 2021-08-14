package com.example.kotlin_class.testes

import com.example.kotlin_class.Funcionario
import com.example.kotlin_class.Gerente
import com.example.kotlin_class.ImprimeRelatorioFuncionario

fun main(){

    val sair = Gerente(nome = "Sair Z Colorado L", cpf = "123456789", salario = 6500.0, senha = "1234")

    ImprimeRelatorioFuncionario.imprime(sair)

    Autenticacao().autentica(sair)

}
