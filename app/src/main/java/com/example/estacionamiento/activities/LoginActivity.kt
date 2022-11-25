package com.example.estacionamiento.activities
import com.example.estacionamiento.entities.Estacionamiento
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.estacionamiento.databinding.ActivityLoginBinding

private lateinit var binding : ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIngresar.setOnClickListener {

            val usuario = binding.etEmail.text.toString()
            val password = binding.etPasswordReg.text.toString()

            if(usuario == "admin" && password == "admin") {
               val mainActivityIntent = Intent(this, MainActivity::class.java)
                startActivity(mainActivityIntent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnRegister.setOnClickListener {
            val registerActivityIntent = Intent(this, RegisterActivity::class.java)
            startActivity(registerActivityIntent)
        }
    }
}