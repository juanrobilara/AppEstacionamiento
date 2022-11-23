package com.example.estacionamiento.entities

data class Usuario(
    val id: Long,
    val nombre: String,
    val apellido: String,
    val password: String,
    val nombreUsuario: String
)