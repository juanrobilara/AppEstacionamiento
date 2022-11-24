package entidades

import java.time.LocalDate
import java.time.LocalTime

class Ciclomotor(patente: String) : Vehiculo(patente) {

    override fun calcularMontoBruto(hora: LocalTime, dia: LocalDate, estadia: Int, tarifaBase : Double) : Double {
        return estadia * tarifaBase
    }

}