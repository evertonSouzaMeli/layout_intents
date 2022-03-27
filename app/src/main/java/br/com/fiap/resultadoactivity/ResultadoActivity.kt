package br.com.fiap.resultadoactivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado_activity)

        val txtResultado = findViewById<TextView>(R.id.lbResultado)

        // o objeto permite recuperar todos os valores definidos na tela anterior
        txtResultado.text = intent.getStringExtra("msg")
    }

}