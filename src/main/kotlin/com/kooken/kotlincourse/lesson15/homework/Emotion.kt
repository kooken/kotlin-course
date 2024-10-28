package com.kooken.kotlincourse.lesson15.homework

class Emotion(val type: String, val intensity: Int) {

    fun express() {
        val description = when {
            intensity <= 3 -> "weak emotion"
            intensity in 4..7 -> "moderate emotion"
            intensity >= 8 -> "srong emotion"
            else -> "unknown"
        }
        println("Emotion: $type, Intensity: $intensity ($description)")
    }
}