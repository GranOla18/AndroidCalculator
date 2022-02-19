package com.example.proyectocalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private var userInput: TextView? = null
    private var calcHist: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById<TextView>(R.id.textView)
        calcHist = findViewById<TextView>(R.id.Calc_History)

        //Number Buttons
        val button1: Button = findViewById<Button>(R.id.button_1)
        val button2: Button = findViewById<Button>(R.id.button_2)
        val button3: Button = findViewById<Button>(R.id.button_3)
        val button4: Button = findViewById<Button>(R.id.button_4)
        val button5: Button = findViewById<Button>(R.id.button_5)
        val button6: Button = findViewById<Button>(R.id.button_6)
        val button7: Button = findViewById<Button>(R.id.button_7)
        val button8: Button = findViewById<Button>(R.id.button_8)
        val button9: Button = findViewById<Button>(R.id.button_9)
        val button0: Button = findViewById<Button>(R.id.button_0)



        //Button 1
        button1?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 1")
                userInput?.append("1")
            }
        })

        //Button 2
        button2?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 2")
                userInput?.append("2")
            }
        })

        //Button 3
        button3?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 3")
                userInput?.append("3")
            }
        })

        //Button 4
        button4?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 4")
                userInput?.append("4")
            }
        })

        //Button 5
        button5?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 5")
                userInput?.append("5")
            }
        })

        //Button 6
        button6?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 6")
                userInput?.append("6")
            }
        })

        //Button 7
        button7?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 7")
                userInput?.append("7")
            }
        })

        //Button 8
        button8?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 8")
                userInput?.append("8")
            }
        })

        //Button 9
        button9?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 9")
                userInput?.append("9")
            }
        })

        //Button 0
        button0?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 0")
                userInput?.append("0")
            }
        })
    }
}