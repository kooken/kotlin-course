package com.kooken.kotlincourse.lesson15.homework

class Concert(
    val band: String,
    val venue: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun showInfo() {
        println("Band is: $band")
        println("Location is: $venue")
        println("Ticket price is: $ticketPrice €")
        println("Venue capacity is: $capacity")
        println("Tickets sold: $soldTickets")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Ticket bought! Amount of sold tickets: $soldTickets")
        } else {
            println("Sold out!")
        }
    }
}