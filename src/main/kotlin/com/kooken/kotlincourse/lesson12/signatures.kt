package com.kooken.kotlincourse.lesson12

// Write a valid method signature

// Write a function signature that takes no arguments and returns no value.

fun function1() = Unit

// Write a function signature that takes two integers and returns their sum.

fun sum(a: Int, b: Int): Int {
    return a + b
}

// Write a function signature that takes a string and returns nothing.

fun function2(string: String) = Unit

// Write a function signature that takes a list of integers and returns the average of a Double.

fun doubleAverage(numbers: List<Int>): Double {
    return numbers.average()
}

// Write a function signature that takes a nullable string and returns its length as a nullable integer.

fun stringLength(str: String?): Int? {
    return str?.length
}

// Write a function signature that takes no arguments and returns a nullable real number.

fun getNullableDouble(): Double? {return null}

// Write a function signature that takes a nullable list of integers and returns no value.

fun processNullableIntList(numbers: List<Int?>?) {}

// Write a function signature that takes an integer and returns a nullable string.

fun intToNullableString(number: Int): String? {return null}

// Write a function signature that takes no arguments and returns a list of nullable strings.

fun getNullableStringList(): List<String?> {
    return listOf(null, null)
}

// Write a function signature that takes a nullable string and a nullable integer and returns a nullable boolean value.

fun checkStringAndInt(str: String?, number: Int?): Boolean? {
    return if (str != null && number != null) {
        str.isNotEmpty() && number > 0
    } else {
        null
    }
}

/*
Task 1:
Write a function multiplyByTwo that takes an integer and returns it multiplied by 2.
 */

fun multiplyByTwo(number: Int): Int {
    return number * 2
}

/*
Task 2:
Create a function isEven that takes an integer and returns true if the number is even and false otherwise.
 */

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

/*
Task 3:
Write a function printNumbersUntil that takes an integer n and prints the numbers from 1 to n.
If n is less than 1, the function should terminate with return without printing any messages.
 */

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }

    for (i in 1..n) {
        println(i)
    }
}

/*
Task 4:
Create a function findFirstNegative that takes a list of integers and returns the first negative number in the list.
If there are no negative numbers, the function should return null.
 */

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

/*
Task 5:
Write a function processList that takes a list of strings. The function should iterate through the list and print
each string. If a null value is encountered, the function should terminate with return without returning a value.
 */

fun processList(strings: List<String?>) {
    for (string in strings) {
        if (string == null) {
            return
        }
        println(string)
    }
}

/*
Task 6
Code refactor
fun drawRectangle(width: Int, height: Int) {
   if (width <= 0) throw IllegalArgumentException("width must be positive and more than 0")
   if (height <= 0) throw IllegalArgumentException("height must be positive and more than 0")

   // Top line
   var topLine = "+"
   for (i in 1 until width - 1) {
       topLine += "-"
   }
   topLine += "+\n"
   print(topLine)

   // Middle line
   for (i in 1 until height - 1) {
       var middleLine = "|"
       for (j in 1 until width - 1) {
           middleLine += " "
       }
       middleLine += "|\n"
       print(middleLine)
   }

   // Bottom line
   var bottomLine = "+"
   for (i in 1 until width - 1) {
       bottomLine += "-"
   }
   bottomLine += "+\n"
   print(bottomLine)
}
 */

fun drawRectangle(width: Int, height: Int) {
    require(width > 0) { "Width must be positive and greater than 0." }
    require(height > 0) { "Height must be positive and greater than 0." }

    // Draw the rectangle
    println(drawLine('+', '-', width))  // Top line

    // Middle lines
    for (i in 1 until height - 1) {
        println(drawLine('|', ' ', width)) // Middle line
    }

    if (height > 1) { // Draw the bottom line only if height > 1
        println(drawLine('+', '-', width))  // Bottom line
    }
}

fun drawLine(startChar: Char, fillChar: Char, length: Int): String {
    return buildString {
        append(startChar)
        repeat(length - 2) { append(fillChar) } // Fill the line with spaces or dashes
        append(startChar)
    }
}
