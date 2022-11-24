package excepciones

class DineroDepositadoInvalido(saldo: Double, mensaje : String) : Exception("Deposito invalido: $saldo $mensaje.")