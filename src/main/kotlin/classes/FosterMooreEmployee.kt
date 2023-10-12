package com.vschouppe.classes

class FosterMooreEmployee(name: String, hair: String, age: Int) : MyPerson(name = name, hairColor = hair, age = age){
    val employedBy = "FosterMoore"

    override fun greetings(){
        print("Hey ")
        whoIsYourEmployer()
        if (age > 0 ){
            super.ageNextYear()
        }
    }

    fun whoIsYourEmployer(){
        println("$name is now employed by $employedBy")
    }
}