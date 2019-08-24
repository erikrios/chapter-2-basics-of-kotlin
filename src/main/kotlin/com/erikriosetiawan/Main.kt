package com.erikriosetiawan

/**
 * This function below are equivalent with this code
   fun printHello(name: String?) {
        if (name != null) {
            println("Hello $name")
        }
    }
 */
fun printHello(name: String?) {
    if (name != null) {
        println("Hello $name")
    }
}

/**
 * Single expression functions
 */
fun double(x: Int): Int = x * 2