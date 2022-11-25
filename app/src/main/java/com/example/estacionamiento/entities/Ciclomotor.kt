package com.example.estacionamiento.entities
import java.time.LocalDate
import java.time.LocalTime
import com.example.estacionamiento.entities.Vehiculo
class Ciclomotor(patente: String) : Vehiculo(patente) {

    override fun calcularMontoBruto(hora: LocalTime, dia: LocalDate, estadia: Int, tarifaBase : Double) : Double {
        return estadia * tarifaBase
    }

}