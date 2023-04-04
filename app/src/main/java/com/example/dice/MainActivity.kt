package com.example.dice

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF03DAC5")))
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            diceRole()
        }
    }

    private fun diceRole() {
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = Random.nextInt(6)+1
        if(randomInt == 6){
            Toast.makeText(this, "You won!!!", Toast.LENGTH_SHORT).show()
        }
        val result = when (randomInt){
            6 -> R.drawable.dice_6
            5 -> R.drawable.dice_5
            4 -> R.drawable.dice_4
            3 -> R.drawable.dice_3
            2 -> R.drawable.dice_2
            else -> R.drawable.dice_1
        }
        diceImage.setImageResource(result)
    }

}