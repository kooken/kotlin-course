package com.kooken.kotlincourse.lesson15

fun main() {
    var lamp1 = Lamp(true)
    lamp1.switch()

    var wind = Wind(10)
    println(wind.convertSpeed())
}