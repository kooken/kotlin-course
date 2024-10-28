package com.kooken.kotlincourse.lesson15.homework

class Party(val location: String, val attendees: Int) {

    fun details() {
        println("Location: $location")
        println("Number of attendees: $attendees")
    }
}