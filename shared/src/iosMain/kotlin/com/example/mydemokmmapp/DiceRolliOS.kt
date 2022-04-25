package com.example.mydemokmmapp

actual fun getDiceRoll(): String {
    return when ((1..6).random()) {
        1 -> "dice_1"
        2 -> "dice_2"
        3 -> "dice_3"
        4 -> "dice_4"
        5 -> "dice_5"
        else -> "dice_6"
    }
}