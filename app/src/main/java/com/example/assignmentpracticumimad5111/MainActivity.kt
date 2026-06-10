package com.example.assignmentpracticumimad5111

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Declare the variables
    private lateinit var txtName: EditText
    private lateinit var numQty: EditText
    private lateinit var spCategory: Spinner
    private lateinit var btnGear: Button
    private lateinit var btnDetailedView: Button
    private lateinit var numItems: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize variables
        txtName = findViewById(R.id.txtName)
        numQty = findViewById(R.id.numQty)
        spCategory = findViewById(R.id.spCategory)
        btnGear = findViewById(R.id.btnGear)
        btnDetailedView = findViewById(R.id.btnDetailedView)
        numItems = findViewById(R.id.numItems)

        // Set click listeners for buttons
        btnGear.setOnClickListener {

        }

        btnDetailedView.setOnClickListener {

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}