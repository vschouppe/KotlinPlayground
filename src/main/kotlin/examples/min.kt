package com.tekadept.demo

fun <T: Comparable<T>> min(param1: T, param2: T): T {
    val results = param1.compareTo(param2)
    return if(results > 0) param2 else param1
}