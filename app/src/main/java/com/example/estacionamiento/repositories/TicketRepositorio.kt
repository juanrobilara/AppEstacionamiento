package com.example.estacionamiento.repositories
import com.example.estacionamiento.entities.Ticket

class TicketRepositorio {
    val tickets = mutableListOf<Ticket>()

    fun agregar(ticket: Ticket) {
        tickets.add(ticket)
    }

    fun eliminar(ticket: Ticket) {
        tickets.remove(ticket)
    }

    fun generarCodigo(): Int {
        return tickets.size
    }

    fun obtenerPorId(id: Int): Ticket? {
        for (ticket in tickets) {
            if (ticket.codigo == id) {
                return ticket
            }
        }
        return null
    }

    //TODO verificar que datos conviene usar para buscar
    fun buscar(idCliente: Int): List<Ticket> {
        val listaTickets = mutableListOf<Ticket>()
        for (ticket in tickets) {
            if (ticket.cliente.id == idCliente) {
                listaTickets.add(ticket)
            }
        }
        return listaTickets
    }

}