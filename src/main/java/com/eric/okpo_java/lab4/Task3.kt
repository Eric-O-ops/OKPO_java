package com.eric.okpo_java.lab4

class Task3 {

    fun main() {
        var product = 1

        for (i in 2..30) {
            if (i % 2 == 0) product *= i
        }

        println("Product: $product")
    }
}