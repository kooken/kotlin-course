package com.kooken.kotlincourse.lesson11

fun main() {

    // Task 1
    val immutableMap: Map<Int, Int> = mapOf()
    println(immutableMap)

    // Task 2
    val floatDoubleMap: Map<Float, Double> = mapOf(
        1.0f to 1.1,
        2.0f to 2.2,
        3.0f to 3.3,
        4.0f to 4.4
    )
    println(floatDoubleMap)

    // Task 3
    val mutableMap: MutableMap<Int, String> = mutableMapOf(
        1 to "Kotlin",
        2 to "Java",
        3 to "Scala"
    )

    // Task 4
    mutableMap[4] = "Swift"
    mutableMap[5] = "Go"
    mutableMap[6] = "Rust"
    println("Updated map: $mutableMap")

    // Task 5
    getValueFromMap(mutableMap, 2)
    getValueFromMap(mutableMap, 5)

    // Task 6
    removeValueFromMap(mutableMap, 2)
    removeValueFromMap(mutableMap, 5)

    // Task 7
    val dictionary: Map<Double, Int> = mapOf(
        1.0 to 2,
        3.0 to 0,
        5.0 to 1,
        7.5 to 0,
        10.0 to 5
    )
    divideKeysByValues(dictionary)

    // Task 8
    println("Original map: $mutableMap")
    updateValueInMap(mutableMap, 1, "JavaScript")
    println("Updated map: $mutableMap")

    // Task 9
    val firstMap: Map<Int, String> = mapOf(
        1 to "Kotlin",
        2 to "Java",
        3 to "Scala"
    )
    val secondMap: Map<Int, String> = mapOf(
        4 to "Python",
        5 to "JavaScript",
        6 to "Go"
    )
    val mergedMap = mergeMaps(firstMap, secondMap)
    println("Merged map: $mergedMap")

    // Task 10
    val numberListsMap: MutableMap<String, List<Int>> = mutableMapOf()
    addNumberListToMap(numberListsMap, "First", listOf(1, 2, 3))
    addNumberListToMap(numberListsMap, "Second", listOf(4, 5, 6, 7))
    addNumberListToMap(numberListsMap, "Third", listOf(8, 9))
    println("Map: $numberListsMap")

    // Task 11
    val stringSetMap: MutableMap<Int, MutableSet<String>> = mutableMapOf()

    addStringSetToMap(stringSetMap, 1, mutableSetOf("Kotlin", "Java"))
    addStringSetToMap(stringSetMap, 2, mutableSetOf("Python", "Scala"))
    addStringSetToMap(stringSetMap, 3, mutableSetOf("JavaScript"))

    val key = 2
    val retrievedSet = stringSetMap[key]

    if (retrievedSet != null) {
        retrievedSet.add("Go")
    }

    println("Set of values by key $key: $retrievedSet")

    // Task 12
    val numberPairMap: MutableMap<Pair<Int, Int>, String> = mutableMapOf(
        Pair(1, 2) to "OneTwo",
        Pair(5, 3) to "FiveThree",
        Pair(4, 5) to "FourFive",
        Pair(6, 7) to "SixSeven",
        Pair(3, 5) to "ThreeFive"
    )
    val results = findValuesWithFive(numberPairMap)

    println("Value with 5 in pair: $results")
}


/*
Task 1: Creating an Empty Dictionary
Create an empty immutable dictionary where keys and values are integers.
 */

// see main

/*
Task 2: Creating and Initializing a Dictionary
Create a dictionary initialized with several key-value pairs where the keys are floats and the values are doubles
 */

// see main

/*
Task 3: Creating a Mutable Dictionary
Create a mutable dictionary where the keys are integers and the values are strings.
 */

// see main

/*
Task 4: Adding Items to a Dictionary
Given a mutable dictionary, add new key-value pairs to it.
 */

// see main

/*
Task 5: Getting Values from a Dictionary
Using the dictionary from the previous task, retrieve a value using a key. Try to get a value with a key that is not
in the dictionary.
 */

fun getValueFromMap(map: Map<Int, String>, key: Int) {
    val value = map[key]
    if (value != null) {
        println("Value for key $key is $value")
    } else {
        println("Key $key isn't in the map!")
    }
}

/*
Task 6: Removing Items from a Dictionary
Remove a specific item from a mutable dictionary by its key.
 */

fun removeValueFromMap(map: MutableMap<Int, String>, key: Int) {
    if (map.containsKey(key)) {
        map.remove(key)
        println("The element with key $key will be deleted.")
    } else {
        println("Key $key isn't in the map!")
    }
}

/*
Task 7: Looping Through a Dictionary
Create a dictionary (Double keys, Int values) and print the result of dividing the key by the value in a loop.
Don't forget to handle division by 0 (in this case, print the word "infinity")
 */

fun divideKeysByValues(dictionary: Map<Double, Int>) {
    for ((key, value) in dictionary) {
        if (value != 0) {
            val result = key / value
            println("The division of $key by $value is $result")
        } else {
            println("Division by zero - infinity")
        }
    }
}

/*
Task 8: Overwriting Dictionary Items
Change the value for an existing key in a mutable dictionary.
 */

fun updateValueInMap(map: MutableMap<Int, String>, key: Int, newValue: String) {
    if (map.containsKey(key)) {
        map[key] = newValue
        println("The key value $key is changed to '$newValue'.")
    } else {
        println("Key $key isn't in the map!")
    }
}

/*
Task 9: Adding Two Dictionaries
Create two dictionaries and combine them into a third mutable dictionary using loops.
 */

fun mergeMaps(map1: Map<Int, String>, map2: Map<Int, String>): MutableMap<Int, String> {
    val mergedMap: MutableMap<Int, String> = mutableMapOf()

    for ((key, value) in map1) {
        mergedMap[key] = value
    }

    for ((key, value) in map2) {
        mergedMap[key] = value
    }

    return mergedMap
}

/*
Task 10: Dictionary with Complex Types
Create a dictionary where the keys are strings and the values are lists of integers.
Add multiple items to this dictionary.
 */

fun addNumberListToMap(map: MutableMap<String, List<Int>>, key: String, value: List<Int>) {
    map[key] = value
}

/*
Task 11: Using a Set as a Value
Create a dictionary where the keys are integers and the values are mutable sets of strings.
Add data to the dictionary. Get the value by key (this should be a set of strings) and add another string to this set.
Print the resulting set.
 */

fun addStringSetToMap(map: MutableMap<Int, MutableSet<String>>, key: Int, value: MutableSet<String>) {
    map[key] = value
}

/*
Task 12: Finding an Element by Value
Create a dictionary where the keys are pairs of numbers. Find a value through enumeration in which the pair contains
the number 5 as the first or second value.
 */

fun findValuesWithFive(map: Map<Pair<Int, Int>, String>): List<String> {
    val resultList = mutableListOf<String>()

    for ((key, value) in map) {
        if (key.first == 5 || key.second == 5) {
            resultList.add(value)
        }
    }

    return resultList
}

/*
Task 6: Dictionary Library
Keys - author of the book, meanings - list of books
 */

val library: MutableMap<String, MutableList<String>> = mutableMapOf()

/*
Task 12: Plant Handbook
Keys - types of plants (e.g. "Flowers", "Trees"), meanings - lists of plant names
 */

val plantHandbook: MutableMap<String, MutableList<String>> = mutableMapOf()

/*
Task 8: Quarterfinals
Keys - names of sports teams, meanings - lists of players for each team
 */

val teams: MutableMap<String, MutableList<String>> = mutableMapOf()

/*
Task 9: Course of treatment
Keys - dates, meanings - list of medications taken on the date
 */

val treatmentSchedule: MutableMap<String, MutableList<String>> = mutableMapOf()

/*
Task 10: Traveler's Dictionary
Keys - countries, meanings - dictionaries from cities with a list of interesting places.
 */

val travelDictionary: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf()
