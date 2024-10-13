package com.kooken.kotlincourse.lesson10

fun main() {
    println(emptyList) // Task 1
    println(stringList) // Task 2

    // Task 3
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("Mutable list: $mutableList")

    // Task 4
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
    println("Mutable list after addition: $mutableList")

    // Task 5
    val mutableStringList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    println("Mutable list before remove: $mutableStringList")
    mutableStringList.remove("World")
    println("Mutable list after remove: $mutableStringList")

    // Task 6
    val numberList = listOf(1, 2, 3, 4, 5)
    for (number in numberList) {
        println(number)
    }

    // Task 7
    val stringList = listOf("Hello", "World", "Kotlin", "Programming", "Language")
    val secondElement = stringList[1]
    println("The second element of the list is: $secondElement")

    // Task 8
    val mutableNumberList: MutableList<Int> = mutableListOf(10, 20, 30, 40, 50)
    println("List before changes: $mutableNumberList")
    mutableNumberList[2] = 99
    println("List after changes: $mutableNumberList")

    // Task 9
    val list1 = listOf("Hello", "World")
    val list2 = listOf("Kotlin", "Programming", "Language")
    val combinedList = combineLists(list1, list2)
    println("Combined list: $combinedList")

    // Task 10
    val numbers1 = listOf(10, 5, 7, 2, 8, 15, 3)
    val (minElement, maxElement) = findMinMax(numbers1)
    println("Minimum: $minElement")
    println("Maximum: $maxElement")

    // Task 11
    val numbers2 = listOf(10, 5, 7, 2, 8, 15, 3, 4)
    val evenNumbers = getEvenNumbers(numbers2)
    println("Even numbers are: $evenNumbers")
}

/*
Task 1: Creating an Empty List
Create an empty immutable list of integers.
 */

val emptyList: List<Int> = listOf()

/*
Task 2: Creating and Initializing a List
Create an immutable list of strings containing three elements (e.g. "Hello", "World", "Kotlin").
 */

val stringList: List<String> = listOf("Hello", "World", "Kotlin")

/*
Task 3: Creating a Mutable List
Create a mutable list of integers and initialize it with values from 1 to 5.
 */

// see main

/*
Task 4: Adding Elements to a List
Given a mutable list of integers, add new elements to it (e.g. 6, 7, 8).
 */

// see main

/*
Task 5: Removing Elements from a List
Given a mutable list of strings, remove a specific element from it (e.g. "World").
 */

// see main

/*
Task 6: Iterate Over a List in a Loop
Create a list of integers and use a loop to print each element to the screen.
 */

// see main

/*
Task 7: Get List Elements by Index
Create a list of strings and get the second element from it using its index.
 */

// see main

/*
Task 8: Overwrite List Elements by Index
Given a mutable list of numbers, change the value of the element at a certain position (for example, replace the element
at position 2 with a new value).
 */

// see main

/*
Task 9: Combine Two Lists
Create two lists of strings and combine them into a new list containing the elements of both lists.
Solve this problem using loops.
 */

fun combineLists(list1: List<String>, list2: List<String>): List<String> {
    val combinedList = mutableListOf<String>()

    for (item in list1) {
        combinedList.add(item)
    }

    for (item in list2) {
        combinedList.add(item)
    }

    return combinedList
}

/*
Task 10: Find Min/Max Element
Create a list of integers and find the minimum and maximum elements in it using a loop.
 */

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    var minElement = list[0]
    var maxElement = list[0]

    for (number in list) {
        if (number < minElement) {
            minElement = number
        }
        if (number > maxElement) {
            maxElement = number
        }
    }

    return Pair(minElement, maxElement)
}

/*
Task 11: Filter a List
Given a list of integers, create a new list containing only the even numbers from the original list using a loop.
 */

fun getEvenNumbers(list: List<Int>): List<Int> {
    val evenList = mutableListOf<Int>()

    for (number in list) {
        if (number % 2 == 0) {
            evenList.add(number)
        }
    }

    return evenList
}