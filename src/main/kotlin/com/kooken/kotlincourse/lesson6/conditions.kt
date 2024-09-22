package com.kooken.kotlincourse.lesson6

// Each task also requires validation of input data, if it makes sense.

/*
Task 1: "Determining Season"
Context: Write a function that returns the season of the year based on a month number.
*/

fun getSeason(monthNumber: Int?) {
    when (monthNumber) {
        null -> println("Month can't be null!")
        12, 1, 2 -> println("It's winter season!")
        3, 4, 5 -> println("It's spring season!")
        6, 7, 8 -> println("It's summer season!")
        9, 10, 11 -> println("It's autumn season!")
        else -> throw Exception("Incorrect input!")
    }
}

/*
Task 2: "Calculating Pet Age"
Context: Create a function that converts a dog's age into "human" years. Up to 2 years, each dog year is equal to
10.5 human years, after that - each year is equal to 4 human years.
*/

fun dogAge(age: Double?) {
    val humanAge = when {
        age == null -> {
            println("Age can't be null!")
            return
        }

        age <= 2.0 -> age * 10.5
        age > 2.0 -> 21 + (age - 2) * 4  // First two years count as (2 * 10.5) = 21
        else -> throw Exception("Incorrect input!")
    }
    println("Human age is $humanAge")
}

/*
Task 3: "Determining Mode of Transport"
Context: Write a function that determines which mode of transport is best to use based on the length of the route.
If the route is up to 1 km - "on foot", up to 5 km - "bicycle", otherwise - "car".
*/

fun transportMode(routeLength: Int?) {
    when {
        routeLength == null -> println("Length can't be null!")
        routeLength <= 1 -> println("It's better to go on foot!")
        routeLength <= 5 -> println("It's better to use a bicycle!")
        routeLength > 5 -> println("It's better to use a car!")
        else -> println("Incorrect input!")
    }
}

/*
Task 4: "Calculating Bonus Points"
Context: Customers of an online store receive bonus points for purchases. Write a function that takes the purchase
amount and returns the number of bonus points: 2 points for every 100 rubles for purchases up to 1000 rubles, and
5 points for every 100 rubles for purchases over that amount.
*/

fun bonusPoints(purchaseAmount: Int?) {
    when {
        purchaseAmount == null -> {
            println("Purchase amount can't be null!")
            return
        }

        purchaseAmount <= 1000 -> {
            val points = (purchaseAmount / 100) * 2
            println("You have earned $points bonus points.")
        }

        purchaseAmount > 1000 -> {
            // points for the first 1000 spent count as (1000/100) * 2 = 20
            val totalPoints = 20 + ((purchaseAmount - 1000) / 100) * 5
            println("You have earned $totalPoints bonus points.")
        }

        else -> println("Invalid purchase amount.")
    }
}

/*
Task 5: "Determining the Document Type"
Context: In a document storage system, each file has an extension. Write a function that returns the file type based
on the file extension: "Text Document", "Image", "Table", or "Unknown Type".
*/

fun documentType(fileName: String?) {
    when {
        fileName == null -> {
            println("File name can't be null!")
            return
        }

        fileName.endsWith(".txt") -> println("Text Document")
        fileName.endsWith(".doc") || fileName.endsWith(".docx") -> println("Text Document")
        fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") -> println("Image")
        fileName.endsWith(".xls") || fileName.endsWith(".xlsx") -> println("Table")
        else -> println("Unknown Type")
    }
}

/*
Task 6: "Temperature Conversion"
Context: Create a function that converts temperatures from Celsius to Fahrenheit and vice versa, depending on the
specified unit of measurement (C/F). The unit of measurement must be passed as the second argument to the function.
Multiple arguments are separated by commas. A string must be returned.
*/

fun convertTemperature(value: Double, unit: String): String {
    return when (unit) {
        "C" -> {
            val fahrenheit = (value * 9 / 5) + 32
            "$value°C is equal to $fahrenheit°F"
        }

        "F" -> {
            val celsius = (value - 32) * 5 / 9
            "$value°F is equal to $celsius°C"
        }

        else -> "Unknown unit of measurement. Please use 'C' for Celsius or 'F' for Fahrenheit."
    }
}


/*
Task 7: "Selection of Clothes by Weather"
Context: Write a function that, based on the air temperature, recommends the type of clothing: "jacket and hat" at
temperatures below 0, "windbreaker" from 0 to 15 degrees, and "T-shirt and shorts" at temperatures above 15. At
temperatures below -30 and above +35, recommend not to leave the house.
*/

fun clothingWeather(temperature: Int): String {
    return when {
        temperature < -30 -> "Don't leave the house!"
        temperature in -30..0 -> "Jacket and hat"
        temperature in 1..15 -> "Windbreaker"
        temperature in 16..35 -> "T-shirt and shorts"
        temperature > 35 -> "Don't leave the house!"
        else -> "Invalid temperature"
    }
}

/*
Task 8: "Selection of Movies by Age"
Context: The cinema offers movies of different age categories. Write a function that accepts the viewer's age and
returns the movie categories available to him: "children's", "teenage", "18+".
*/

fun movieCategory(age: Int): String {
    return when {
        age < 13 -> "Children's"
        age in 13..17 -> "Teenage"
        age >= 18 -> "18+"
        else -> "Invalid age!"
    }
}
