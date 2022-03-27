package br.com.fiap.resultadoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculaPreco()
    }

    private fun calculaPreco() {
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val editTextAlcool = findViewById<EditText>(R.id.editTextAlcool)
            val editTextGasolina = findViewById<EditText>(R.id.editTextGasolina)

            val precoAlcool = editTextAlcool.text.toString().toDouble()
            val precoGasolina = editTextGasolina.text.toString().toDouble()

            val resultado = precoAlcool / precoGasolina


            var mensagem = when {
                resultado > 0.7 -> "Gasolina"
                resultado < 0.7 -> "Alcool"
                else -> "Tanto faz"
            }

            var intentResultado = Intent(this, ResultadoActivity::class.java)
            intentResultado.putExtra("msg", mensagem)
            startActivity(intentResultado)
        }
    }
}