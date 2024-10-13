package com.kooken.kotlincourse.lesson10

fun main() {
    println(numbers.contentToString())
    println(strings.contentToString())
    println(createDoubleArray().contentToString())
    println(intArray().contentToString())
    println(nullableStrings.contentToString())

    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = copyArray(originalArray)
    println(copiedArray.contentToString())

    val array1 = arrayOf(10, 20, 30, 40, 50)
    val array2 = arrayOf(5, 15, 25, 35, 45)
    val resultArray = subtractArrays(array1, array2)
    println(resultArray.contentToString())

    val numbersToFind = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val index = findIndex(numbersToFind, 5)
    println(index)

    val parityNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    printParity(parityNumbers)

    val stringArray = arrayOf("apple", "banana", "cherry", "date", "blueberry")
    val searchString = "err"
    val foundElement = findSubstring(stringArray, searchString)
    if (foundElement != null) {
        println("Found string: $foundElement")
    } else {
        println("String not found!")
    }
}

/*
Task 1: Creating and Initializing an Array
Create an array of 5 integers and initialize it with values from 1 to 5.
 */

val numbers = arrayOf(1, 2, 3, 4, 5)

/*
Task 2: Creating an Empty Array
Create an empty array of strings with a size of 10 elements.
 */

val strings = Array(10) { "" }

/*
Task 3: Filling an Array in a Loop
Create an array of 5 Double elements and fill it with values that are twice the index of the element.
 */

fun createDoubleArray(): Array<Double> {
    val array = Array(5) { 0.0 }

    for (i in array.indices) {
        array[i] = (i * 2).toDouble()
    }

    return array
}

/*
Task 4: Modifying Array Elements
Create an array of 5 Int elements. Use a loop to assign each element a value equal to its index multiplied by 3.
 */

fun intArray(): Array<Int> {
    val intArray = Array(5) { 0 }

    for (i in intArray.indices) {
        intArray[i] = i * 3
    }
    return intArray
}

/*
Task 5: Working with Nullable Elements
Create an array of 3 nullable strings. Initialize it with one null value and two strings.
 */

val nullableStrings: Array<String?> = arrayOf(null, "Hello", "World")

/*
Task 6: Copying an Array
Create an array of integers and copy it to a new array in a loop.
 */

fun copyArray(original: Array<Int>): Array<Int> {
    val copiedArray = Array(original.size) { 0 }

    for (i in original.indices) {
        copiedArray[i] = original[i]
    }

    return copiedArray
}

/*
Task 7: Difference of Two Arrays
Create two arrays of integers of the same length. Create a third array by subtracting the values of one from the other.
 */

fun subtractArrays(array1: Array<Int>, array2: Array<Int>): Array<Int> {
    if (array1.size != array2.size) {
        throw Exception("Arrays must have the same length")
    }

    val resultArray = Array(array1.size) { 0 }

    for (i in array1.indices) {
        resultArray[i] = array1[i] - array2[i]
    }

    return resultArray
}

/*
Task 8: Finding the Index of an Element
Create an array of integers. Find the index of the element with the value 5. If the value 5 is not in the array,
return -1. Solve this problem using a while loop.
 */

fun findIndex(array: Array<Int>, target: Int): Int {
    var index = 0

    while (index < array.size) {
        if (array[index] == target) {
            return index
        }
        index++
    }

    return -1
}

/*
Task 9: Iterating over an Array
Create an array of integers. Use a loop to iterate over the array and print each element to the console.
Each element should be labeled with “even” or “odd”.
 */

fun printParity(array: Array<Int>) {
    for (number in array) {
        val parity = if (number % 2 == 0) "even" else "odd"
        println("$number - $parity")
    }
}

/*
Task 10: Finding a Value in an Array by Occurrence
Create a function that accepts an array of strings and a string to search for.
The function should find an element in the array in which the received string is a substring (the contains() method).
Return the found element from the function as a string.
 */

fun findSubstring(array: Array<String>, substring: String): String? {
    for (element in array) {
        if (element.contains(substring)) {
            return element
        }
    }
    return null
}