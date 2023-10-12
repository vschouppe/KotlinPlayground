package com.tekadept.demo.classes

import com.tekadept.demo.interfaces.Vehicle

class Car : Vehicle {
    override val MakeName = "Ford"
    override fun getDoors(): Int {
        return 5
    }
}