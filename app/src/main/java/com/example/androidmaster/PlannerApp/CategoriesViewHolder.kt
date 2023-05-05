package com.example.androidmaster.PlannerApp

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R

class CategoriesViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskcategories: Taskcategories){
        tvCategoryName.text = "Ejemplo"

            when(taskcategories){
                Taskcategories.Personal-> {
                    tvCategoryName.text = "Personal"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_personal_category))
                }
                Taskcategories.Sport-> {
                    tvCategoryName.text = "Deportes"
                    divider.setBackgroundColor((ContextCompat.getColor(divider.context, R.color.todo_Sport_category)))
                }
                Taskcategories.Business-> {
                    tvCategoryName.text = "Negocios"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_business_category))
                }
                Taskcategories.Ocio-> {
                    tvCategoryName.text = "Ocio"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_Ocio_category))
                }
                Taskcategories.Other-> {
                    tvCategoryName.text = "Otros"
                    divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.todo_other_category))
                }


            }

    }
}