package com.example.mydemokmmapp

class GenerateNumber {
    fun generateRandomNumber(min: Int, max: Int): Int {
        return (min..max).random()
    }
}