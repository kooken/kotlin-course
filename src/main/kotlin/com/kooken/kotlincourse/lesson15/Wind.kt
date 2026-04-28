package com.kooken.kotlincourse.lesson15

class Wind(val speed: Int) {

    fun convertSpeed(): Double {
        return speed * 1000.0 / 3600
    }
}