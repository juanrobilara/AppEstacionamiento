package com.example.estacionamiento.repositories

import com.example.estacionamiento.entities.Usuario

class UsuarioRepositorio {
    val usuarios = mutableListOf<Usuario>()


    fun agregar(usuario: Usuario) {
        if(existe(usuario.nombre)){

            error("No se puede agregar, el nombre ${usuario.nombreUsuario} ya está en uso")
        }
        usuarios.add(usuario)
    }

    fun eliminar(usuario: Usuario) {
        usuarios.remove(usuario)
    }

    fun existe(nombreUsuario: String): Boolean {
        for(usuario in usuarios) {
            if(usuario.nombreUsuario == nombreUsuario) {

                return true
            }
        }
        return false

        //TODO: Completar
    }

    fun iniciar(nombreUsuario: String, password: String): Usuario? {

        for (usuario in usuarios) {
            if(usuario.nombreUsuario == nombreUsuario && usuario.password == password) {
                return usuario
            }
        }
        return null
        //TODO: Completar
    }

}