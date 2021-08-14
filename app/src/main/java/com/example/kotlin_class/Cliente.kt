package com.example.kotlin_class

class Cliente(
        nome: String,
        cpf : String,
        val tipoCliente: ClienteTipo,
        val senha: String
): Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        nome = $nome
        cpf = $cpf
        tipo = ${tipoCliente.descricao}
    """.trimIndent()
}