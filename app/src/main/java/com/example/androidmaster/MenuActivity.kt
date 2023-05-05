package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.IMCalculator.IMCalculatorActivity
import com.example.androidmaster.PlannerApp.PlannerAppActivity
import com.example.androidmaster.firstApp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludapp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCapp = findViewById<Button>(R.id.btnIMCApp)
        val btnPlannerApp = findViewById<Button>(R.id.btnPlannerApp)
        btnSaludapp.setOnClickListener { navigateToSaludApp() }
        btnIMCapp.setOnClickListener { navigatetoIMCApp() }
        btnPlannerApp.setOnClickListener { navigateToPlannerApp() }
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigatetoIMCApp() {
        val intent = Intent(this, IMCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToPlannerApp() {
        val intent = Intent(this, PlannerAppActivity::class.java)
        startActivity(intent)
    }
}