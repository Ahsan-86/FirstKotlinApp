package com.ahsan.firstappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    var diceImage : ImageView? = null      // we have to check for null value each time
    lateinit var diceImage : ImageView      // it tells the compiler that it will be initialized before any calls.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }
//        val countUpButton: Button = findViewById(R.id.count_up_button)
//        countUpButton.setOnClickListener{ countUp() }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{ reset() }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice(){
//        Toast.makeText(this, "button clicked!", Toast.LENGTH_SHORT).show()
//        val randomInt = (1..6).random()
//
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        if(resultText.text == "Hello World!"){
//            resultText.text = "1"
//        }else{
//            var resultInt = resultText.text.toString().toInt()
//            if(resultInt <6){
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
    }

    private fun reset(){
        diceImage.setImageResource(R.drawable.empty_dice)
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "1"
    }
}
