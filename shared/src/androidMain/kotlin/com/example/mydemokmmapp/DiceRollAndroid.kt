package com.example.mydemokmmapp

actual fun getDiceRoll(): String {
    return (1..6).random().toString()
}