package com.example.proyectocalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

private val TAG = "MainActivity"
private val TEXT = "TEXT_CONTENT"

class MainActivity : AppCompatActivity() {

    private var userInput: TextView? = null
    private var calcHist: TextView? = null
    var input: String = ""

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
        var num1F: Float = 0f
        var num2F: Float = 0f
        var isFloat: Boolean = false
        var result: Int = 0
        var resultF: Float = 0f
        var calcHistTxt: String = ""

        //Button 1
        button1?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 1")
                userInput?.append("1")
                input += "1"
            }
        })

        //Button 2
        button2?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 2")
                userInput?.append("2")
                input += "2"
                Log.d(TAG,input)
            }
        })

        //Button 3
        button3?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 3")
                userInput?.append("3")
                input += "3"
            }
        })

        //Button 4
        button4?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 4")
                userInput?.append("4")
                input += "4"
            }
        })

        //Button 5
        button5?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 5")
                userInput?.append("5")
                input += "5"
            }
        })

        //Button 6
        button6?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 6")
                userInput?.append("6")
                input += "6"
            }
        })

        //Button 7
        button7?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 7")
                userInput?.append("7")
                input += "7"
            }
        })

        //Button 8
        button8?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 8")
                userInput?.append("8")
                input += "8"
            }
        })

        //Button 9
        button9?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 9")
                userInput?.append("9")
                input += "9"
            }
        })

        //Button 0
        button0?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick 0")
                userInput?.append("0")
                input += "0"
            }
        })

        //Button dot
        buttonDot?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick dot")
                userInput?.append(".")
                input += "."
                calcHistTxt = num1F.toString()
                Log.d(TAG, num1F.toString())
                isFloat = true
            }
        })

        //Button C
        buttonC?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick C")
                userInput?.setText("")
                calcHist?.setText("")
                input = ""
                num1 = 0
                num2 = 0
                num1F = 0f
                num2F = 0f
            }
        })

        //Button plus
        buttonSum?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Sum")
                oper = 1
                if(isFloat) {
                    num1F = input.toFloat()
                }
                else {
                    //num1 = input.removeAt(0)
                    num1 = input.toInt()
                    //calcHist?.setText(num1.toString())
                }
                userInput?.append(" + ")
                input = ""
            }
        })

        //Substract
        buttonMin?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Min")
                oper = 2
                if(isFloat) {
                    num1F = input.toFloat()
                }
                else {
                    num1 = input.toInt()

                }
                userInput?.append(" - ")
                input = ""
            }
        })

        //Multiplicate
        buttonMult?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Mult")
                oper = 3
                if(isFloat) {
                    num1F = input.toFloat()
                }
                else {
                    num1 = input.toInt()
                }
                userInput?.append(" x ")
                input = ""
            }
        })

        //Division
        buttonDiv?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Div")
                oper = 4
                if(isFloat) {
                    num1F = input.toFloat()
                }
                else {
                    num1 = input.toInt()
                }
                userInput?.append(" ÷ ")
                input = ""
            }
        })

        //Calculation
        buttonEqu.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick Equal")
                if(isFloat) {
                    num2F = input.toFloat()
                    Log.d(TAG, num2F.toString())
                    //Sum
                    if(oper == 1) {
                        //Log.d(TAG, "aki")
                        resultF = num1F + num2F
                        //calcHist?.setText(num1, )
                        calcHistTxt = num1F.toString() + " + " + num2F.toString()
                    }
                    //Min
                    else if (oper == 2) {
                        resultF = num1F - num2F
                        calcHistTxt = num1F.toString() + " - " + num2F.toString()
                    }
                    //Mult
                    else if (oper == 3) {
                        resultF = num1F * num2F
                        calcHistTxt = num1F.toString() + " x " + num2F.toString()
                    }
                    //Div
                    else if (oper == 4) {
                        resultF = num1F / num2F
                        calcHistTxt = num1F.toString() + " ÷ " + num2F.toString()
                    }
                    userInput?.setText(resultF.toString())
                    input = resultF.toString()
                }
                else {
                    num2 = input.toInt()
                    Log.d(TAG, "akulla")
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
                        resultF = (num1 / num2).toFloat()
                        calcHistTxt = num1.toString() + " ÷ " + num2.toString()
                    }
                    userInput?.setText(result.toString())
                    //input.add(result)
                    input = result.toString()
                }
                calcHist?.setText(calcHistTxt)
            }
        })
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
        userInput?.text = savedInstanceState.getString(TEXT)
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT, userInput?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}