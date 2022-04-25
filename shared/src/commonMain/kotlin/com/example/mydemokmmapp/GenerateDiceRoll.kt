package com.example.mydemokmmapp

class GenerateDiceRoll {
    fun androidDiceRoll(): Int {
        return getDiceRoll().toInt()
    }

    fun iosDiceRoll(): String {
        return getDiceRoll()
    }
}

expect fun getDiceRoll(): String