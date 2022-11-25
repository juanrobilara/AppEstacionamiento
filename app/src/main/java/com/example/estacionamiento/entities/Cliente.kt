package com.example.estacionamiento.entities
import com.example.estacionamiento.entities.Vehiculo
import com.example.estacionamiento.exceptions.DineroDepositadoInvalido
import java.time.LocalDate

data class Cliente(
    val id: Int,
    val nombre: String,
    val apellido: String,
    val fechaAlta: LocalDate,
    val vehiculo: Vehiculo,
    var saldo: Double = 0.0
) {

    fun descontarSaldo(monto: Double) {
        this.saldo -= monto
    }


    fun depositarSaldo(monto: Double) {
        try {
            validarMonto(monto)
        }catch (e : DineroDepositadoInvalido){
            println(e.message)
            return
        }
        this.saldo += monto
        println("Deposito exitoso!")
    }

    private fun validarMonto(monto: Double) {
        if (monto < 0.0){
            throw DineroDepositadoInvalido(monto," es un valor negativo")
        }
    }




}