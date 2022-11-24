package entidades

import java.time.LocalDate
import java.time.LocalTime

class Automovil(patente: String) : Vehiculo(patente) {

    private val horaPicoDiurnaInicio = LocalTime.of(9, 0)
    private val horaPicoDiurnaFin = LocalTime.of(11, 30)
    private val horaPicoNocturnaInicio = LocalTime.of(18, 0)
    private val horaPicoNocturnaFin = LocalTime.of(20, 0)

    override fun calcularMontoBruto(hora: LocalTime, dia: LocalDate, estadia: Int, tarifaBase: Double): Double {
        return estadia * tarifaBase + recargo(hora, tarifaBase)
    }

    private fun recargo(hora: LocalTime, tarifaBase: Double): Double {
        return when {
            (hora.isAfter(horaPicoDiurnaInicio) && hora.isBefore(horaPicoDiurnaFin)) -> (tarifaBase.times(5)).div(100)
            (hora.isAfter(horaPicoNocturnaInicio) && hora.isBefore(horaPicoNocturnaFin)) -> (tarifaBase.times(5)).div(100)
            else -> (tarifaBase.times(3)).div(100)
        }
    }

}

