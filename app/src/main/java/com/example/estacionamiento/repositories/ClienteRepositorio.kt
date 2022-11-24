package com.example.estacionamiento.repositories
import com.example.estacionamiento.entities.Cliente

class ClienteRepositorio {
    val clientes = mutableListOf<Cliente>()

    fun agregar(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun eliminar(cliente: Cliente) {
        clientes.remove(cliente)
    }

    fun obtenerPorId(id: Long): Cliente? {
        //TODO: Completar
        for (cliente in clientes) {
            if (cliente.id == id) {
                return cliente
            }
        }
        return null

    }

    fun buscar(apellido: String, nombre: String): Cliente? {
        //TODO: Completar
        for (cliente in clientes) {
            if (cliente.nombre contentEquals nombre && cliente.apellido contentEquals apellido) {
                cliente
            }
        }
        return null
    }
}