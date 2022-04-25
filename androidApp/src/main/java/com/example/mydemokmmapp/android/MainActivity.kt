package com.example.mydemokmmapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.mydemokmmapp.GenerateDiceRoll

/**
 * This is the base android activity for the Dice Roller application
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultView: ImageView = findViewById(R.id.dice_image)

        findViewById<Button>(R.id.generate_button).setOnClickListener {
            resultView.setImageResource(getImageResource())
        }
    }

    private fun getImageResource(): Int {
        return when (GenerateDiceRoll().androidDiceRoll()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
