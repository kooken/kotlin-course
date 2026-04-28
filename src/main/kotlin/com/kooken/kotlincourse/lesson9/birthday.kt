package com.kooken.kotlincourse.lesson9

fun main() {
    val name = "Sasha"
    val isTeachingKotlin = true

    println("Happy Birthday, $name!")

    if (isTeachingKotlin) {
        println("I wish you to write perfect code with no bugs 🐞")
        println("May your students always understand Kotlin on the first try 👩🏻‍💻")
    } else {
        println("I wish you lots of joy and success in all your endeavours!")
    }

    val cakeSlices = (1..100).random()
    println("And yes, you deserve $cakeSlices slices of cake 🎂. But don't forget to share 👀")

    println("May your code compile on the first attempt, and may the only errors be in the examples for your students 🥺")
}
