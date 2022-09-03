package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {

    lateinit var DiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        DiceImage = findViewById(R.id.dice_image)
        rollButton.text = "Let's Roll!"
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val RandomInt = Random.nextInt(6) + 1
        val ImageResource = when (RandomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage.setImageResource(ImageResource)
    }
}
