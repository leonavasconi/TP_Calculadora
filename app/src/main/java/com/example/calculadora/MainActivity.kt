package com.example.calculadora

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val edtNum1 = findViewById<EditText>(R.id.edt_num1)
        val  edtNum2 = findViewById<EditText>(R.id.edt_num2)
        val btnMais = findViewById<Button>(R.id.btn_mais)
        val btnMenos = findViewById<Button>(R.id.btn_menos)
        val btnVezes = findViewById<Button>(R.id.btn_vezes)
        val btnDiv = findViewById<Button>(R.id.btn_div)
        val txtResultado = findViewById<TextView>(R.id.txt_resultado)

        btnMais.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado:Int = valor1 + valor2
            txtResultado.text = "O resultado é: $resultado"
        }

        btnMenos.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado:Int = valor1 - valor2
            txtResultado.text = "O resultado é: $resultado"
        }

        btnVezes.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado:Int = valor1 * valor2
            txtResultado.text = "O resultado é: $resultado"
        }

        btnDiv.setOnClickListener {
            val valor1 = edtNum1.text.toString().toDouble()
            val valor2 = edtNum2.text.toString().toDouble()
            if (valor2 != 0.0) {
                val resultado: Double = valor1 / valor2
                txtResultado.text = "O resultado é: %.1f".format(resultado)
            } else {
                txtResultado.text = "Erro"
            }
        }


    }
}