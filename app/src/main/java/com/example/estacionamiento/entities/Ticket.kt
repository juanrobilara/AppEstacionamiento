package com.example.estacionamiento.entities

import java.time.LocalDate
import java.time.LocalTime

data class Ticket(
    val codigo: Int,
    val fechaIngreso: LocalDate,
    val horaIngreso: LocalTime,
    val vehiculo: String,
    val estadia: Int,
    val montoBruto: Double,
    val montoFinal: Double
)