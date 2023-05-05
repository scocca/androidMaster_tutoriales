package com.example.androidmaster.PlannerApp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PlannerAppActivity : AppCompatActivity() {
    private val categories = listOf(
        Taskcategories.Business,
        Taskcategories.Personal,
        Taskcategories.Other,
        Taskcategories.Sport,
        Taskcategories.Ocio
    )

    private val tasks = mutableListOf(
            Task("tarea1", Taskcategories.Business),
            Task("Tarea2" , Taskcategories.Sport),
            Task("Tarea3" , Taskcategories.Ocio),
            Task("Tarea4" , Taskcategories.Personal),
    )

    private lateinit var rvCategories:RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var rvTask: RecyclerView
    private lateinit var taskAdapter: TaskAdapter
    private lateinit var fabAddTask: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planner_app)
        initComponents()
        initUI()
        initListeners()
    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTask = findViewById(R.id.rvTask)
        fabAddTask = findViewById(R.id.fabAddTask)

    }

    private fun initUI(){
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter = TaskAdapter(tasks) {position ->onItemSelected(position)}
        rvTask.layoutManager = LinearLayoutManager(this)
        rvTask.adapter = taskAdapter
    }

   /* private fun OnItemSelected(position: Int){
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks()
    }*/

    private fun onItemSelected(position:Int){
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks()
    }

    private fun initListeners(){
        fabAddTask.setOnClickListener {showDialog()}
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)


        val btnPlus: Button = dialog.findViewById(R.id.btnPlus)
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        btnPlus.setOnClickListener {
            val currentTask = etTask.text.toString()
            if (currentTask.isNotEmpty()) {
                val selectedID = rgCategories.checkedRadioButtonId
                val selectedRadioButton: RadioButton = rgCategories.findViewById(selectedID)
                val curretnCategory: Taskcategories = when (selectedRadioButton.text) {
                    getString(R.string.Business) -> Taskcategories.Business
                    getString(R.string.Personal) -> Taskcategories.Personal
                    getString(R.string.Ocio) -> Taskcategories.Ocio
                    getString(R.string.Sport) -> Taskcategories.Sport
                    else -> Taskcategories.Other
                }
                tasks.add(Task(etTask.text.toString(), curretnCategory))
                dialog.hide()
                updateTasks()
            }

        }
        dialog.show()
    }

    private fun updateTasks(){
        taskAdapter.notifyDataSetChanged()
    }
}