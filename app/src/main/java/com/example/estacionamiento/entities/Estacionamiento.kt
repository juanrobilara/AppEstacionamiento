package com.example.estacionamiento.entities
//import interfaz.estacionamiento
//import interfaz.iniciarMenu
import com.example.estacionamiento.repositories.ClienteRepositorio
import com.example.estacionamiento.repositories.TicketRepositorio
import com.example.estacionamiento.repositories.UsuarioRepositorio

import java.time.LocalDate
import java.time.LocalTime
import java.time.Period

class Estacionamiento(val nombre: String, val tarifaBase: Double = 150.0) {

    val ticketRepository = TicketRepositorio()
    val clientes = ClienteRepositorio()
    val usuarios = UsuarioRepositorio()


    fun aplicarBeneficio(fechaDeAlta: LocalDate, montoBruto: Double): Double {
        val antiguedad = Period.between(fechaDeAlta, LocalDate.now()).toTotalMonths()
        return when {
            (antiguedad <= 1) -> montoBruto - (montoBruto.times(50)).div(100)
            (antiguedad <= 6) -> montoBruto - (montoBruto.times(25)).div(100)
            else -> montoBruto
        }
    }

    fun crearTicket(cliente: Cliente, estadia: Int) {
        val montoBruto =
            cliente.vehiculo.calcularMontoBruto(LocalTime.now(), LocalDate.now(), estadia, this.tarifaBase)
        val montoFinal = aplicarBeneficio(cliente.fechaAlta, montoBruto)
        return if (cliente.saldo > montoFinal) {
            //Crear ticket
            val ticket = Ticket(
                ticketRepository.generarCodigo(),
                cliente,
                LocalDate.now(),
                LocalTime.now(),
                cliente.vehiculo,
                estadia,
                montoBruto,
                montoFinal
            )

            //Guardar ticket en repositorio!
            ticketRepository.agregar(ticket)
            cliente.descontarSaldo(montoFinal)
            println("Ticket generado!")
            //iniciarMenu()
        } else {
            println("Saldo insuficiente!")
            //iniciarMenu()
        }
    }

    fun mostrarTickets(usuario: Usuario) {
        for (ticket in ticketRepository.buscar(usuario.cliente.id)) {
            println(ticket.toString())
        }
    }

    fun generarId(): Int {
        return clientes.generarId();
    }


}
