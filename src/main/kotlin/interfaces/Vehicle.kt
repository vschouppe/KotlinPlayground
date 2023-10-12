package com.tekadept.demo.interfaces

interface Vehicle {
    val MakeName: String
    fun go() {
        println("Vroom, vroom")
    }

    fun stop() {
        println("Screehing")
    }

    fun getMpg(): Int {
        return 50
    }
    fun getDoors(): Int
}