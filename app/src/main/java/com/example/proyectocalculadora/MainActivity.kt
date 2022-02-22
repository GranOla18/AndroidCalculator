package com.example.proyectocalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.log

private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private var userInput: TextView? = null
    private var calcHist: TextView? = null
    val input = mutableListOf<Int>()
    var inputFloat: Float = 0f

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

        //Operations Buttons
        val buttonC: Button = findViewById<Button>(R.id.button_C)
        val buttonSum: Button = findViewById<Button>(R.id.button_plus)
        val buttonMin: Button = findViewById<Button>(R.id.button_minus)
        val buttonMult: Button = findViewById<Button>(R.id.button_multiplication)
        val buttonDiv: Button = findViewById<Button>(R.id.button_division)
        val buttonEqu: Button = findViewById<Button>(R.id.button_equal)

        val buttonDot: Button = findViewById<Button>(R.id.button_dot)

        var oper: Int = 0
        var num1: Int = 0
        var num2: Int = 0
        var result: Int = 0
        var calcHistTxt: String = ""

        //Button 1
        button1?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 1")
                userInput?.append("1")
                input.add(1)
            }
        })

        //Button 2
        button2?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 2")
                userInput?.append("2")
                input.add(2)
            }
        })

        //Button 3
        button3?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 3")
                userInput?.append("3")
                input.add(3)
            }
        })

        //Button 4
        button4?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 4")
                userInput?.append("4")
                input.add(4)
            }
        })

        //Button 5
        button5?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 5")
                userInput?.append("5")
                input.add(5)
            }
        })

        //Button 6
        button6?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 6")
                userInput?.append("6")
                input.add(6)
            }
        })

        //Button 7
        button7?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 7")
                userInput?.append("7")
                input.add(7)
            }
        })

        //Button 8
        button8?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 8")
                userInput?.append("8")
                input.add(8)
            }
        })

        //Button 9
        button9?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 9")
                userInput?.append("9")
                input.add(9)
            }
        })

        //Button 0
        button0?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 0")
                userInput?.append("0")
                input.add(0)
            }
        })

        //Button dot
        buttonDot?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick dot")
                userInput?.append(".")
            }
        })

        //Button C
        buttonC?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick C")
                userInput?.setText("")
                calcHist?.setText("")
            }
        })

        //Button plus
        buttonSum?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Sum")
                num1 = input.removeAt(0)
                oper = 1
                userInput?.append(" + ")
                calcHist?.setText(num1.toString())
            }
        })

        //Substract
        buttonMin?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Min")
                num1 = input.removeAt(0)
                oper = 2
                userInput?.append(" - ")
            }
        })

        //Multiplicate
        buttonMult?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Mult")
                num1 = input.removeAt(0)
                oper = 3
                userInput?.append(" x ")
            }
        })

        //Division
        buttonDiv?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Div")
                num1 = input.removeAt(0)
                oper = 4
                userInput?.append(" ÷ ")
            }
        })

        //Calculation
        buttonEqu.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Equal")
                num2 = input.removeAt(0)

                if(oper == 1) {
                    result = num1 + num2
                    //calcHist?.setText(num1, )
                    calcHistTxt = num1.toString() + " + " + num2.toString()
                }
                else if (oper == 2) {
                    result = num1 - num2
                    calcHistTxt = num1.toString() + " - " + num2.toString()
                }
                else if (oper == 3) {
                    result = num1 * num2
                    calcHistTxt = num1.toString() + " x " + num2.toString()
                }
                else if (oper == 4) {
                    result = num1 / num2
                    calcHistTxt = num1.toString() + " ÷ " + num2.toString()
                }
                userInput?.setText(result.toString())
                calcHist?.setText(calcHistTxt)
                input.add(result)
            }
        })
    }
}