package com.example.estacionamiento.entities

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import com.example.estacionamiento.entities.Vehiculo

class Pesado(patente: String) : Vehiculo(patente) {

    override fun calcularMontoBruto(hora: LocalTime, dia: LocalDate, estadia: Int, tarifaBase : Double) : Double{
        return estadia * tarifaBase + recargo(dia, tarifaBase)
    }

    private fun recargo(dia : LocalDate, tarifaBase : Double): Double {
        return if ((dia.dayOfWeek == DayOfWeek.SATURDAY) || (dia.dayOfWeek == DayOfWeek.SUNDAY)) {
            (tarifaBase.times(10)).div(100)
        } else (tarifaBase.times(5)).div(100)
    }
}