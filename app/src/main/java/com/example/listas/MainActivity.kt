package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val dados = listOf<String>(
            "Azul",
            "Vermelho",
            "Amarelo",
            "Verde",
            "Preto",
            "Branco",
            "Rosa",
            "Roxo",
            "Azul",
            "Vermelho",
            "Amarelo",
            "Verde",
            "Preto",
            "Branco",
            "Rosa",
            "Roxo",
            "Azul",
            "Vermelho",
            "Amarelo",
            "Verde",
            "Preto",
            "Branco",
            "Rosa",
            "Roxo"
        )

        val adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            dados
        )

        listView.adapter = adapter;
    }
}