package com.example.listas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val listaUsuarios : List<Usuario>) : RecyclerView.Adapter<RecyclerViewAdapter.UsuarioViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_usuario,
            parent,
            false)
        return UsuarioViewHolder(view)
    }

    override fun getItemCount(): Int = listaUsuarios.count()

    override fun onBindViewHolder(viewHolder: UsuarioViewHolder, position: Int) {
        viewHolder.bind(listaUsuarios[position])
    }

    inner class UsuarioViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val tvNome : TextView = view.findViewById(R.id.tvNome)
        private val tvIdade : TextView = view.findViewById(R.id.tvIdade)
        private val tvId : TextView = view.findViewById(R.id.tvId)

        fun bind(usuario: Usuario){
            tvNome.text = "Nome: ${usuario.nome}"
            tvIdade.text = "Nome: ${usuario.idade}"
            tvId.text = "Nome: ${usuario.id}"
        }
    }
}