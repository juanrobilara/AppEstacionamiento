package com.example.estacionamiento.entities

import java.time.LocalDate

data class Cliente(
    val id: Long, val nombre: String, val apellido: String, val saldo: Double, val fechaAlta: LocalDate)