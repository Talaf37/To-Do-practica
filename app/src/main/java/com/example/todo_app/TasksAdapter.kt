package com.example.todo_app

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TasksAdapter (private val tasks:List<Task>) :
    RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = tasks.size

}