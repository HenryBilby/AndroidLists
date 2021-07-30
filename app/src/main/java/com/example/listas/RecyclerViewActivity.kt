package com.example.listas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val listaUsuario = mutableListOf<Usuario>()

        for (i in 1..20){
            listaUsuario.add(
                Usuario( i, "Nome $i", 30+1)
            )
        }


        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = RecyclerViewAdapter(listaUsuario)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}