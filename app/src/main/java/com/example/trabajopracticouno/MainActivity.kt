package com.example.trabajopracticouno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chequearPalindromo: Button = findViewById(R.id.b_chequearPalindromo)
        val pasarAFahrenheit: Button = findViewById(R.id.b_pasarFahrenheit)

        chequearPalindromo.setOnClickListener(View.OnClickListener {

            val palabra: EditText = findViewById(R.id.e_palabra)
            val palabraReverso = palabra.text.toString().reversed()

            if(palabra.text.toString().isEmpty())
            {
                Toast.makeText(this, "Escriba algo, esta vacio", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            if(palabra.text.toString() == palabraReverso)
            {
                Toast.makeText(this, "Es palindromo", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            Toast.makeText(this, "No es palindromo", Toast.LENGTH_SHORT).show()
        })

        pasarAFahrenheit.setOnClickListener(View.OnClickListener{

            val celsius: EditText = findViewById(R.id.e_celsius)

            if(celsius.text.toString().isEmpty())
            {
                Toast.makeText(this, "Escriba una temperatura en Celsius, esta vacio", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            val pasadoAFahrenheit = (celsius.text.toString().toInt() * 1.8) + 32

            Toast.makeText(this, "En Fahrenheit son $pasadoAFahrenheit", Toast.LENGTH_SHORT).show()

        })



    }
}