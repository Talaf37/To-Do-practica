package com.example.todo_app

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val CategoryNameTextView:TextView = view.findViewById(R.id.CategoryNameTextView)
    private val divider:View = view.findViewById(R.id.divider)

    @SuppressLint("SetTextI18n")
    fun render(taskCategory: TaskCategory) {

        when (taskCategory) {
            TaskCategory.Business -> {
                CategoryNameTextView.text = "Negocios"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.business_category)
                )
            }
            TaskCategory.Home -> {
                CategoryNameTextView.text = "Hogar"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.home_category)
                )
            }
            TaskCategory.Personal -> {
                CategoryNameTextView.text = "Personal"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.personal_category)
                )
            }
            TaskCategory.Shopping -> {
                CategoryNameTextView.text = "Compras"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.shopping_category)
                )
            }
        }
    }

}