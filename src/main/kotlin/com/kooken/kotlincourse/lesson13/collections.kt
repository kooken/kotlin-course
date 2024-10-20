package com.kooken.kotlincourse.lesson13

fun main() {
    // Task 3

    val emptyList = listOf<Int>()
    println(evaluateCollection(emptyList))

    val shortList = listOf(1, 2, 3, 4)
    println(evaluateCollection(shortList))

    val startingList = listOf(0, 5, 10, 15)
    println(evaluateCollection(startingList))

    val massiveList = listOf(5000, 6000, 1)
    println(evaluateCollection(massiveList))

    val balancedList = listOf(10, 10, 10, 10, 10)
    println(evaluateCollection(balancedList))

    val stickyList = listOf(1, 2, 3, 4, 56789, 56789)
    println(evaluateCollection(stickyList))

    val negativeList = listOf(-11, -12, -13)
    println(evaluateCollection(negativeList))

    val positiveList = listOf(1500, 2000, 3000)
    println(evaluateCollection(positiveList))

    val specialList = listOf(3, 14, 5, 7)
    println(evaluateCollection(specialList))

    val uniqueList = listOf(5, 8, 10, 12, 13)
    println(evaluateCollection(uniqueList))

    // Task 4

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val result = analyzeGrades(grades)
    println("Top 3 passing grades: $result")

    // Task 5

    val list = listOf(
        "Table", "chair", "vase", "Mug", "Mirror", "carpet", "wardrobe", "clock",
        "Chandelier", "pillow", "Picture", "small table", "Flowerpot", "curtains",
        "Pouf", "book", "Photo frame", "lamp", "Rug", "hanger", "Stand", "TV",
        "Chest of drawers", "shelf", "Lampshade", "sofa", "Armchair", "curtain",
        "Uplighter", "ashtray", "Globe", "statuette", "Tray", "figurine", "Key case",
        "blanket", "Nightstand", "toy", "Wall clock", "candlestick", "Coffee table",
        "souvenir", "Laundry basket", "dishes", "Table lamp", "floor lamp", "Bookshelf"
    )

    val directory = createDirectoryByFirstLetter(list)
    directory.forEach { (letter, words) ->
        println("$letter: $words")
    }

    // Task 6

    val averageLength = calculateAverageWordLength(list)
    println("Average word length: $averageLength symbols")

    // Task 7

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val categorizedNumbers = categorizeNumbers(numbers)

    categorizedNumbers.forEach { (parity, nums) ->
        println("$parity: $nums")
    }

    // Task 8

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val resultAge = findFirstMatchingAge(ages)
    println(resultAge)
}

// Task 1

//Check if the collection size is greater than 5 elements - .size method

//Check if the collection is empty - .isEmpty() method

//Check if the collection is not empty - .isNotEmpty() method

//Take an element by index or create a value if the index does not exist - .getOrElse() method

//Collect the collection into a string - .joinToString() method

//Calculate the sum of all values - .sum() method

//Calculate the average - .average() method

//Take the maximum number - .maxOrNull() method

//Take the minimum number - .minOrNull() method

//Take the first number or null - .firstOrNull() method

//Check if the collection contains an element - .contains() method

// Task 2

//Filter the collection by the range 18-30 - .filter { it in 18..30 }

//Select numbers that are not divisible by 2 and 3 at the same time - .filterNot { it % 2 == 0 && it % 3 == 0 }

//Clear the text collection from null elements - .filterNotNull()

//Convert the text collection to a collection of word lengths - .map { it.length }

//Convert the text collection to a map where the keys are words and the values are reversed words - .associate { it to it.reversed() }

//Sort the list alphabetically - .sorted()

//Sort the list in descending order - .sortedDescending()

//Print the squares of the list elements - .forEach { println(it * it) }

//Group the list by the first letter of the words - .groupBy { it.first() }

//Clear the list from duplicates - .distinct()

//Take the first 3 elements of the list - .take(3)

//Take the last 3 elements of the list - .takeLast(3)

// Task 3

/*
Write a method that takes a collection of numbers and returns a string with the current state of the collection using the when construct
If the collection is empty - “Empty”
If the number of elements is less than five - “Short”
If the collection starts with 0 - “Starting”
If the sum of all numbers is greater than 10000 - “Massive”
If the average is 10 - “Balanced”
If the length of the string formed by gluing the collection into a string is 20 - “Sticky”
If the maximum number is less than -10 - “Negative”
If the minimum number is greater than 1000 - “Positive”
If it contains both 3 and 14 - “F***ing”
Otherwise - “Unique”

Call the method with data that matches each of the branches
 */

fun evaluateCollection(collection: List<Int>): String {
    return when {
        collection.isEmpty() -> "Empty"
        collection.firstOrNull() == 0 -> "Starting"
        collection.sum() > 10000 -> "Massive"
        collection.average() == 10.0 -> "Balanced"
        collection.joinToString("").length == 20 -> "Sticky"
        (collection.maxOrNull() ?: 0) < -10 -> "Negative"
        (collection.minOrNull() ?: 0) > 1000 -> "Positive"
        collection.contains(3) && collection.contains(14) -> "F***ing"
        collection.size < 5 -> "Short"
        else -> "Unique"
    }
}

// method call is in the main! <3

// Task 4

/*
Analysis of Academic Grades
Initial values: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
Goal: Filter out passing grades (>=60), sort the remaining ones in ascending order and take the first 3.
 */

fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades.filter { it >= 60 }
        .sorted()
        .take(3)
}

// Task 5

/*
Creating a directory by first letter. Initial values:
val list = listOf("Table", "chair", "vase", "Mug", "Mirror", "carpet", "wardrobe", "clock",
        "Chandelier", "pillow", "Picture", "small table", "Flowerpot", "curtains",
        "Pouf", "book", "Photo frame", "lamp", "Rug", "hanger", "Stand", "TV",
        "Chest of drawers", "shelf", "Lampshade", "sofa", "Armchair", "curtain",
        "Uplighter", "ashtray", "Globe", "statuette", "Tray", "figurine", "Key case",
        "blanket", "Nightstand", "toy", "Wall clock", "candlestick", "Coffee table",
        "souvenir", "Laundry basket", "dishes", "Table lamp", "floor lamp", "Bookshelf")
Goal: Convert all words in the list to lower case, group them into a catalog by the first letter.
 */

fun createDirectoryByFirstLetter(items: List<String>): Map<Char, List<String>> {
    return items.map { it.lowercase() }
        .groupBy { it.first() }
}

// Task 6

/*
Calculating the average length of words in a list.
Initial values from previous task.
Goal: Convert all words to the number of letters, calculate the average value.
Output formatted text with two decimal places.
 */

fun calculateAverageWordLength(words: List<String>): String {
    val lengths = words.map { it.length }
    val average = if (lengths.isNotEmpty()) {
        lengths.average()
    } else {
        0.0
    }
    return String.format("%.2f", average)
}

// Task 7

/*
Categorization of numbers.
Initial values: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
Goal: Select unique numbers, sort in descending order and group by parity (“even” and “odd”).
 */

fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers.distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "even" else "odd" }
}

// Task 8

/*
Finding the first matching element
Initial values: val ages = listOf(22, 18, 30, 45, 17, null, 60)
Goal: Find the first age in the list that matches the condition (greater than 18), convert it to a string,
or return the message "No matching age found".
 */

fun findFirstMatchingAge(ages: List<Int?>): String {
    val firstAge = ages.firstOrNull { it != null && it > 18 }
    return firstAge?.toString() ?: "No matching age found"
}