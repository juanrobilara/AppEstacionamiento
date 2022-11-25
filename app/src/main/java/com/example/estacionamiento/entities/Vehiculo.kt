package com.example.estacionamiento.entities

import java.time.LocalDate
import java.time.LocalTime

abstract class Vehiculo(val patente : String) {

    abstract fun calcularMontoBruto(hora : LocalTime, dia : LocalDate, estadia : Int, tarifaBase : Double) : Double

}