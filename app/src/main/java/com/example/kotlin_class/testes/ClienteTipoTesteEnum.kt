package com.example.kotlin_class.testes

import com.example.kotlin_class.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")

}