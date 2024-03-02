package com.example.todo_app

sealed class TaskCategory {
    object Home : TaskCategory()
    object Shopping : TaskCategory()
    object Personal : TaskCategory()
    object Business : TaskCategory()
}