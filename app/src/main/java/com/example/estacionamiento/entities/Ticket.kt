package com.example.estacionamiento.entities

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*


data class Ticket(
    val codigo: Int,
    val cliente : Cliente,
    val fechaIngreso: LocalDate,
    val horaIngreso: LocalTime,
    val vehiculo: Vehiculo,
    val estadia: Int,
    val montoBruto: Double,
    val montoFinal: Double

){
    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.US)

    override fun toString(): String {
        return """
            --------------
            Codigo Ticket: ${codigo}
            Fecha Ingreso: ${fechaIngreso}
            Hora Ingreso: ${formatter.format(horaIngreso)}
            Vehiculo: ${vehiculo.patente}
            Estadia: ${estadia}
            Monto Bruto: ${montoBruto}
            Monto Final: ${montoFinal}
            --------------""".trimIndent()
    }
}