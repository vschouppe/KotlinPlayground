package com.vschouppe.classes

open class MyPerson(val name:String, val hairColor: String){
    var age = 0
    constructor(name:String, hairColor: String, age: Int) : this(name, hairColor){
        this.age = age
    }

    open fun greetings(){
        print("Hey, $name, you got nice $hairColor hair")
        if (age > 0 ){
            println(" for a $age year old")
        }
    }

    open fun ageNextYear(){
        var nextAge = age + 1
        println("next year you'll be $nextAge")
    }

}



