package com.example.leavingcertpointscalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {





    // initialize a variable to hold the running total of the numbers
    private var total = 0

    // declare variables for the TextViews
    private lateinit var mainTextView: TextView
    private lateinit var totalTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //MobileAds.initialize(this) {}




        // initialize the TextView variables
        mainTextView = findViewById(R.id.workingsTV)
        totalTextView = findViewById(R.id.resultsTV)

        // define click listeners for each button
        val button1 = findViewById<Button>(R.id.H1Btn)
        button1.setOnClickListener {
            val number = 100
            updateMainTextView(number)
            addToTotal(number)

        }

        val button2 = findViewById<Button>(R.id.H2Btn)
        button2.setOnClickListener {
            val number = 88
            updateMainTextView(number)
            addToTotal(number)
        }

        val button3 = findViewById<Button>(R.id.H3Btn)
        button3.setOnClickListener {
            val number = 77
            updateMainTextView(number)
            addToTotal(number)
        }

        val button4 = findViewById<Button>(R.id.H4Btn)
        button4.setOnClickListener {
            val number = 66
            updateMainTextView(number)
            addToTotal(number)
        }

        val button5 = findViewById<Button>(R.id.H5Btn)
        button5.setOnClickListener {
            val number = 56
            updateMainTextView(number)
            addToTotal(number)
        }


        val button6 = findViewById<Button>(R.id.H6Btn)
        button6.setOnClickListener {
            val number = 46
            updateMainTextView(number)
            addToTotal(number)
        }
        val button7 = findViewById<Button>(R.id.H7Btn)
        button7.setOnClickListener {
            val number = 37
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO1 = findViewById<Button>(R.id.O1Btn)
        buttonO1.setOnClickListener {
            val number = 56
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO2 = findViewById<Button>(R.id.O2Btn)
        buttonO2.setOnClickListener {
            val number = 46
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO3 = findViewById<Button>(R.id.O3Btn)
        buttonO3.setOnClickListener {
            val number = 37
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO4 = findViewById<Button>(R.id.O4Btn)
        buttonO4.setOnClickListener {
            val number = 28
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO5 = findViewById<Button>(R.id.O5Btn)
        buttonO5.setOnClickListener {
            val number = 44
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO6 = findViewById<Button>(R.id.O6Btn)
        buttonO6.setOnClickListener {
            val number = 12
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonO7 = findViewById<Button>(R.id.O7Btn)
        buttonO7 .setOnClickListener {
            val number = 0
            updateMainTextView(number)
            addToTotal(number)
        }
        val button25 = findViewById<Button>(R.id.plus25Btn)
        button25 .setOnClickListener {
            val number = 25
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttondis = findViewById<Button>(R.id.distBtn)
        buttondis .setOnClickListener {
            val number = 66
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonmerit = findViewById<Button>(R.id.meritBtn)
        buttonmerit .setOnClickListener {
            val number = 46
            updateMainTextView(number)
            addToTotal(number)
        }
        val buttonpass = findViewById<Button>(R.id.PassBtn)
        buttonpass .setOnClickListener {
            val number = 28
            updateMainTextView(number)
            addToTotal(number)
        }




        val acButton = findViewById<Button>(R.id.acBtn)
        acButton.setOnClickListener {
            resetMainTextView()
            resetTotalTextView()
        }
    }

    // function to update the mainTextView with a number and operator
    private fun updateMainTextView(number: Int, operator: String = "+") {
        val currentText = mainTextView.text.toString()
        if (currentText.isEmpty()) {
            mainTextView.text = number.toString()
        } else {
            mainTextView.text = currentText + operator + number.toString()
        }
    }

    // function to add a number to the running total and update the totalTextView
    private fun addToTotal(number: Int) {
        total += number
        totalTextView.text = total.toString()
    }

    // function to reset the mainTextView to an empty string
    private fun resetMainTextView() {
        mainTextView.text = ""
    }

    // function to reset the total to 0 and update the totalTextView
    private fun resetTotalTextView() {
        total = 0
        totalTextView.text = total.toString()
    }
}
