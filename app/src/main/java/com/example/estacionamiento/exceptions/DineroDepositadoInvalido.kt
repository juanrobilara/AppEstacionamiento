package com.example.estacionamiento.exceptions

class DineroDepositadoInvalido(saldo: Double, mensaje : String) : Exception("Deposito invalido: $saldo $mensaje.")