package com.kooken.kotlincourse.lesson10

fun main() {
    println(immutableSet1) // Task 1
    println(immutableSet2) // Task 2

    // Task 3
    val mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println("Mutable set: $mutableSet")

    // Task 4
    mutableSet.add("Swift")
    mutableSet.add("Go")
    println("Updated set after addition: $mutableSet")

    // Task 5
    val mutableIntSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    mutableIntSet.remove(2)
    println("Updated set after 2nd element removal: $mutableSet")

    // Task 6
    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    for (number in numberSet) {
        println(number)
    }

    // Task 7
    val stringSet: Set<String> = setOf("Kotlin", "Java", "Scala")
    val searchString = "Java"
    val isFound = containsString(stringSet, searchString)
    println("Is string \"$searchString\" found in the set? The answer is $isFound")

    // Task 8
    val set1: Set<String> = setOf("Kotlin", "Java", "Scala")
    val set2: Set<String> = setOf("Java", "Swift", "Go")
    val combinedSet = combineSets(set1, set2)
    println("Combined set: $combinedSet")

    // Task 9
    val set1ToIntersect: Set<Int> = setOf(1, 2, 3, 4, 5)
    val set2ToIntersect: Set<Int> = setOf(4, 5, 6, 7, 8)
    val intersection = findIntersection(set1ToIntersect, set2ToIntersect)
    println("Sets intersection: $intersection")

    // Task 10
    val set1ToDiffer: Set<String> = setOf("Kotlin", "Java", "Scala", "Swift")
    val set2ToDiffer: Set<String> = setOf("Java", "Swift", "Go")
    val difference = findDifference(set1ToDiffer, set2ToDiffer)
    println("The difference between the 1st set and the 2nd set: $difference")

    // Task 11
    val stringSetToConvert: Set<String> = setOf("Kotlin", "Java", "Scala", "Swift")
    val stringList = convertSetToList(stringSetToConvert)
    println("Converted list from the set: $stringList")

}

/*
Task 1: Creating an Empty Set
Create an empty immutable set of integers.
 */

val immutableSet1: Set<Int> = setOf()

/*
Task 2: Creating and Initializing a Set
Create an immutable set of integers containing three distinct elements (e.g. 1, 2, 3).
 */

val immutableSet2: Set<Int> = setOf(1, 2, 3)

/*
Task 3: Creating a Mutable Set
Create a mutable set of strings and initialize it with several values (e.g. "Kotlin", "Java", "Scala").
 */

// see main

/*
Task 4: Adding Elements to a Set
Given a mutable set of strings, add new elements to it (e.g. "Swift", "Go").
 */

// see main

/*
Task 5: Removing Elements from a Set
Given a mutable set of integers, remove a specific element from it (e.g. 2).
 */

// see main

/*
Task 6: Iterating Over a Set in a Loop
Create a set of integers and use a loop to print each element to the screen.
 */

// see main

/*
Task 7: Checking for Element in a Set
Create a function that takes a set of strings and a string and checks if the set contains the specified string.
Return a Boolean value of true if the string is present. Solve the problem using a loop.
 */

fun containsString(set: Set<String>, searchString: String): Boolean {
    for (element in set) {
        if (element == searchString) {
            return true
        }
    }
    return false
}

/*
Task 8: Union of Two Sets
Create two sets of strings and combine them into a new set containing all the unique elements of both sets.
Solve the problem using loops.
 */

fun combineSets(set1: Set<String>, set2: Set<String>): Set<String> {
    val resultSet = mutableSetOf<String>()

    for (element in set1) {
        resultSet.add(element)
    }

    for (element in set2) {
        resultSet.add(element)
    }

    return resultSet
}

/*
Task 9: Finding the Intersection of Sets
Create two sets of integers and find their intersection (common elements). Solve the problem using nested loops.
 */

fun findIntersection(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    val resultSet = mutableSetOf<Int>()

    for (element1 in set1) {
        for (element2 in set2) {
            if (element1 == element2) {
                resultSet.add(element1)
            }
        }
    }

    return resultSet
}

/*
Task 10: Finding the Difference of Sets
Create two sets of strings and find the difference between the first set and the second set (elements present in the
first set but absent from the second). Solve the problem using nested loops and variable flags.
 */

fun findDifference(set1: Set<String>, set2: Set<String>): Set<String> {
    val resultSet = mutableSetOf<String>()

    for (element1 in set1) {
        var isFound = false

        for (element2 in set2) {
            if (element1 == element2) {
                isFound = true
                break
            }
        }

        if (!isFound) {
            resultSet.add(element1)
        }
    }

    return resultSet
}

/*
Task 11: Converting a Set to a List
Create a set of strings and convert it to a list using a loop.
 */

fun convertSetToList(set: Set<String>): List<String> {
    val resultList = mutableListOf<String>()

    for (element in set) {
        resultList.add(element)
    }

    return resultList
}