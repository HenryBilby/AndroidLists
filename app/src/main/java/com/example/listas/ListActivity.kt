package com.example.listas

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val listaUsuario = mutableListOf<Usuario>()

        for (i in 1..20){
            listaUsuario.add(
                Usuario( i, "Nome $i", 30+1)
            )
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = ListAdapter(listaUsuario)
    }
}