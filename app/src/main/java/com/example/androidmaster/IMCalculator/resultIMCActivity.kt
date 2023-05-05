package com.example.androidmaster.IMCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.androidmaster.IMCalculator.IMCalculatorActivity.Companion.IMC_KEY
import com.example.androidmaster.R

class resultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvImc:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imcactivity)
        val result = intent.extras?.getDouble(IMC_KEY)?:-1.0
        initComponents()
        initUi(result)
        initListeners()
    }

    private fun initComponents(){
        tvResult = findViewById(R.id.tvResult)
        tvImc = findViewById(R.id.tvImc)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById(R.id.btnReCalculate)
    }

    private fun initUi(result: Double) {
        tvImc.text =result.toString()
        when (result){
            in 0.00..18.50 -> { //bajo peso
                tvResult.text = getString(R.string.LowWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.Low_Weight))
                tvDescription.text = getString(R.string.DesLowWeight)
            }
            in 18.51..24.99 -> { //peso normal
                tvResult.text = getString(R.string.NormalWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.Normal_Weight))
                tvDescription.text = getString(R.string.DesNormalWeight)
            }
            in 25.00..29.99 -> { //sobre peso
                tvResult.text = getString(R.string.OverWeight)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.Over_Weight))
                tvDescription.text = getString(R.string.DesOverWeight)
            }
            in 30.00..99.99 -> {//obesidad
                tvResult.text = getString(R.string.Obesity)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.Obesity))
                tvDescription.text = getString(R.string.DesObesity)
            }
            else -> {//error
                tvImc.text = getString(R.string.Error)
                tvResult.text = getString(R.string.Error)
                tvDescription.text = getString(R.string.Error)
            }
        }
    }

    private fun initListeners(){

        btnRecalculate.setOnClickListener{
          onBackPressed()
        }

    }

}