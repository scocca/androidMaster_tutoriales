package com.example.androidmaster.PlannerApp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {
        if(task.isSelected){
            tvTask.paintFlags=tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }else{
            tvTask.paintFlags=tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        val color = when (task.category){
            Taskcategories.Business -> R.color.todo_business_category
            Taskcategories.Ocio -> R.color.todo_Ocio_category
            Taskcategories.Other -> R.color.todo_other_category
            Taskcategories.Personal -> R.color.todo_personal_category
            Taskcategories.Sport -> R.color.todo_Sport_category
        }

        tvTask.text = task.name
        cbTask.isChecked=task.isSelected
        cbTask.buttonTintList= ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )
    }

}