package com.example.todo_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CategoriesAdapter(private val categories:List<TaskCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position])
    }

    //aqui abajo le digo que la funcion  de getItemCount me devuelva la variable "categories".
    //esta acortado a una sola linea. Pero ahi en realidad pone un "return"
    override fun getItemCount() = categories.size

}