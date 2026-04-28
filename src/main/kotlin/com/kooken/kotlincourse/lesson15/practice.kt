package com.kooken.kotlincourse.lesson15

fun main() {
    val lamp1 = Lamp(true)
    lamp1.switch()

    val wind = Wind(10)
    println(wind.convertSpeed())
}