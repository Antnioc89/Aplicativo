package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val botao = findViewById<Button>(R.id.button3)

        botao.setOnClickListener{

            irParaQuartaTela()

        }


    }

    private fun irParaQuartaTela() {
        val botao3 = Intent(this, MainActivity4::class.java)
        startActivity(botao3)
    }
}