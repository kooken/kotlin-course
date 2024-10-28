package com.kooken.kotlincourse.lesson15.homework

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("The Moon phase: $phase")
        } else {
            println("We can't see the Moon at this moment")
        }
    }
}