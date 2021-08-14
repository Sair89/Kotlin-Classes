package com.example.kotlin_class

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        val senha : String
): Funcionario(nome, cpf, salario), Logavel {

    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "1234" == senha
}