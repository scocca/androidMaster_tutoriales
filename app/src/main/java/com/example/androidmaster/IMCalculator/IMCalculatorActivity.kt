package com.example.androidmaster.IMCalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.androidmaster.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class IMCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight: Int = 60
    private var currentAge: Int = 24
    private var currentHeight: Int = 150

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var btnWeightMinus: FloatingActionButton
    private lateinit var btnWeightPlus: FloatingActionButton
    private lateinit var tvWeightkg: TextView
    private lateinit var btnMinusAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAgea: TextView
    private lateinit var btnCalculate: Button

    companion object {
        const val IMC_KEY = "IMC_RESULT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcalculator)
        initComponents()
        initListeners()
        initUi()
    }


    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnWeightMinus = findViewById(R.id.btnWeightMinus)
        btnWeightPlus = findViewById(R.id.btnWeightPlus)
        tvWeightkg = findViewById(R.id.tvWeightkg)
        btnMinusAge = findViewById(R.id.btnAgeMinus)
        btnPlusAge = findViewById(R.id.btnAgePlus)
        tvAgea = findViewById(R.id.tvAgea)
        btnCalculate = findViewById(R.id.btnCalculate)
    }

    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGenderColor()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGenderColor()
            setGenderColor()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"

        }
        btnWeightMinus.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
        btnWeightPlus.setOnClickListener {
            currentWeight += 1
            setWeight()
        }

        btnMinusAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }

        btnPlusAge.setOnClickListener {
            currentAge += 1
            setAge()
        }

        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }

    private fun initUi() {
        setGenderColor()
        setWeight()
        setAge()
    }

    private fun changeGenderColor() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val btnColor = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }
        return ContextCompat.getColor(this, btnColor)
    }

    private fun setWeight() {
        tvWeightkg.text = currentWeight.toString() + " kg"
    }

    private fun setAge() {
        tvAgea.text = currentAge.toString() + " años"
    }

    private fun calculateIMC(): Double {
        val df = DecimalFormat("#.##")
        val imc = currentWeight / (currentHeight.toDouble() / 100 * currentHeight.toDouble() / 100)
        return df.format(imc).toDouble()
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, resultIMCActivity::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }
}