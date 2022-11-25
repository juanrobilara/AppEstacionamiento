package com.example.estacionamiento.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.estacionamiento.R
import com.example.estacionamiento.databinding.ActivityRegisterBinding


private lateinit var binding: ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val spinnerVehiculos = binding.spinnerVehiculos




    binding.buttonCancel.setOnClickListener {
        val loginActivityIntent = Intent(this, LoginActivity::class.java)
        startActivity(loginActivityIntent)
    }
    binding.buttonRegister.setOnClickListener {

    }

    }
}