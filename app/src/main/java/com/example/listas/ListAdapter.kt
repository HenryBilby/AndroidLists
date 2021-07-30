package com.example.listas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(val listaUsuario: MutableList<Usuario>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View
        val viewHolder : ViewHolder
        if (convertView == null) {
            //inflar o layout
            val layoutInflater = LayoutInflater.from(parent?.context)
            view = layoutInflater.inflate(R.layout.item_usuario, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        viewHolder.tvNome.text = listaUsuario[position].nome
        viewHolder.tvIdade.text = listaUsuario[position].idade.toString()
        viewHolder.tvId.text = listaUsuario[position].id.toString()

        return view
    }

    override fun getItem(position: Int): Any {
        return listaUsuario[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listaUsuario.count()
    }
    // override fun getCount() : Int = listaUsuario.count()
}

class ViewHolder(view: View){
    val tvNome: TextView
    val tvIdade: TextView
    val tvId: TextView

    init{
        tvNome = view.findViewById(R.id.tvNome)
        tvIdade = view.findViewById(R.id.tvIdade)
        tvId = view.findViewById(R.id.tvId)
    }
}