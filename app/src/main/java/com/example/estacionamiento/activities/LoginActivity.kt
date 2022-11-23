package com.example.estacionamiento.activities

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

            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            if(email == "admin" && password == "admin") {
               val mainActivityIntent = Intent(this, MainActivity::class.java)
                startActivity(mainActivityIntent)
            } else {
                Toast.makeText(this, "Por favor ingrese valores correctos", Toast.LENGTH_LONG).show()
            }
        }
    }
}