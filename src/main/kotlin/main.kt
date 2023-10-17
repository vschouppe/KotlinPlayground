package com.vschouppe.training

fun main(args: Array<String>) {
    val tricked = trick
    trick()
    tricked()
    var number = giveUs5()
    val manyCoins : (Int) -> String = {
        "So many coins"
    }
    val xCoins : (Int) -> String = {number ->
        "$number coins"
    }
    val function1 = times2(manyCoins)
    val function2 = times2(xCoins)
    function1()
    function2()
    var list = listOf<Int>(1,3,5,7,9)
    list.filterNot {i-> i ==3 || i ==9 }
    list.forEach { each ->
        println("list item $each")
    }
    println (list.filterNot {i-> i ==3 || i ==9 })
    writeSomething("Write this 5 x", { giveUs5() })

}

val trick = {
    println("This is a tricky function")
}

fun giveUs5(): Int {
    return 5
}

fun times2(anyValue: (Int) -> String): () -> Unit{
    println(anyValue(3))
    return trick
}

fun writeSomething(text : String, action: () -> Int){
    for (i in 1..action()){
        println(text)
    }
}