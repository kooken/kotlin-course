package com.kooken.kotlincourse.lesson5

fun main() {
    soundIntensity(100.0, 5.0)
    soundIntensity(100.0, null)
    totalDeliveryCost(null, 100.0)
    totalDeliveryCost(1000.0, 200.0)
    atmosphericPressure(200.0)
    atmosphericPressure(null)
}

/*
Context: You are studying the physical phenomenon of sound attenuation in a room. You have a measured value of the
initial sound intensity, but due to limitations of the equipment, the attenuation coefficient may sometimes be unknown.

Task: Calculate the expected sound intensity after attenuation. The sound intensity after attenuation is proportional
to the initial intensity multiplied by the attenuation coefficient. If the attenuation coefficient is unknown, use the
default value of 0.5.
*/

fun soundIntensity(initSoundIntensity: Double, attenCoeff: Double?) {
    println(initSoundIntensity * (attenCoeff ?: 0.5))
}

/*
Context: The customer pays for the delivery of the cargo. The cost of delivery is supplemented by cargo insurance,
which is 0.5% of its value. If the cost is not specified, then the standard cost of $50 is taken.

Task: Calculate the total cost of delivery.
*/

fun totalDeliveryCost(cargoCost: Double?, deliveryCost: Double) {
    val insuranceCost = 0.5
    val totalCargoCost = cargoCost ?: 50.0
    val totalInsuranceCost = insuranceCost * totalCargoCost
    println(totalInsuranceCost + deliveryCost + totalCargoCost)
}

/*
Context: You are taking meteorological measurements. One of the important indicators is atmospheric pressure,
which must be recorded. The lab technician brings you a set of indicators, but may lose something along the way.

Task: To report an error in case of missing atmospheric pressure readings.
*/

fun atmosphericPressure(atm: Double?) {
    atm ?: throw Exception("Need an atmospheric pressure measurement results!")
}