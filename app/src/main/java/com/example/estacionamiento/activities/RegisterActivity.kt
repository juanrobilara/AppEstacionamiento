package com.example.estacionamiento.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.estacionamiento.databinding.ActivityRegisterBinding


private lateinit var binding: ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}