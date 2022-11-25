package com.example.estacionamiento.entities


data class Usuario(
    val id: Int,
    val nombreUsuario: String,
    val password: String,
    val cliente : Cliente
)