package com.vschouppe

import com.vschouppe.classes.FosterMooreEmployee
import com.vschouppe.classes.MyPerson

fun main(args: Array<String>) {
    val bert = FosterMooreEmployee("Bert", "brown",18)
    bert.greetings()

    val fred = MyPerson("Fred", "White",34)
    fred.greetings()
    fred.ageNextYear()

}