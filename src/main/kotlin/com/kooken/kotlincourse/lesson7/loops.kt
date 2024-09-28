package com.kooken.kotlincourse.lesson7

// used main and functions just for debugging!

fun main() {
    loop1to5()
    eventill10()
    loop5to1()
    loop10to1()
    loop1to9()
    loop1to20()
    loopexcl9()
    loop3to15()
    square1to5()
    loop10to5()
    doLoop5To1()
    doLoop5To10()
    loop10to1break6()
    loop1Break10()
    loop1to10Even()
    loopSkips3()
    nestedLoop()
}

// FOR LOOPS

// Forward Range

// Write a for loop that prints the numbers from 1 to 5

fun loop1to5() {
    println("A for loop that prints the numbers from 1 to 5:")
    for (i in 1..5) {
        println(i)
    }
}

// Write a for loop that prints the even numbers from 1 to 10

fun eventill10() {
    println("A for loop that prints the even numbers from 1 to 10:")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

// Reverse Range

// Create a for loop that prints the numbers from 5 to 1

fun loop5to1() {
    println("A for loop that prints the numbers from 5 to 1:")
    for (i in 5 downTo 1) {
        println(i)
    }
}

// Create a for loop that prints the numbers from 10 to 1, decreasing by 2

fun loop10to1() {
    println("A for loop that prints the numbers from 10 to 1, decreasing by 2:")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

// With Step:

// Use a for loop with a step of 2 to print the numbers from 1 to 9

fun loop1to9() {
    println("A for loop with a step of 2 to print the numbers from 1 to 9:")
    for (i in 1..9 step 2) {
        println(i)
    }
}

//Write a for loop that prints every third number in the range from 1 to 20

fun loop1to20() {
    println("A for loop that prints every third number in the range from 1 to 20:")
    for (i in 1..20 step 3) {
        println(i)
    }
}

// Using Until

// Use a for loop and until to print numbers from 1 to 9 (excluding 9)

fun loopexcl9() {
    println("A for loop and until to print numbers from 1 to 9 (excluding 9):")
    for (i in 1 until 9) {
        println(i)
    }
}

// Write a for loop with until to print numbers from 3 to 15, excluding 15

fun loop3to15() {
    println("A for loop and until to print numbers from 3 to 15, excluding 15:")
    for (i in 3 until 15) {
        println(i)
    }
}

// WHILE LOOPS

// Create a while loop that prints the squares of numbers from 1 to 5

fun square1to5() {
    println("A while loop that prints the squares of numbers from 1 to 5:")
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
}

// Write a while loop that decrements a number from 10 to 5

fun loop10to5() {
    println("A while loop that that decrements a number from 10 to 5:")
    var i = 10
    while (i >= 5) {
        println(i)
        i--
    }
}

// DO ... WHILE LOOPS

// Use a do...while loop to print numbers from 5 to 1

fun doLoop5To1() {
    println("A do...while loop to print numbers from 5 to 1:")
    var i = 5
    do {
        println(i)
        i--
    } while (i >= 1)

}

// Create a do...while loop that repeats while the counter is less than 10, starting with 5

fun doLoop5To10() {
    println("A do...while loop that repeats while the counter is less than 10, starting with 5:")
    var i = 5
    do {
        println(i)
        i++
    } while (i < 10)
}

// BREAK

// Write a for loop from 1 to 10 and use break to exit the loop when it reaches 6

fun loop10to1break6() {
    println("A for loop from 1 to 10 and use break to exit the loop when it reaches 6:")
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
}

// Create a while loop that prints numbers infinitely starting with 1, but breaks when it reaches 10

fun loop1Break10() {
    println("A while loop that prints numbers infinitely starting with 1, but breaks when it reaches 10:")
    var i = 1
    while (true) {
        println(i)
        if (i == 10) {
            break
        }
        i++
    }
}

// CONTINUE

// In a for loop from 1 to 10, use continue to skip even numbers

fun loop1to10Even() {
    println("A for loop from 1 to 10, use continue to skip even numbers:")
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

}

// Write a while loop that prints numbers from 1 to 10, but skips multiples of 3

fun loopSkips3() {
    println("A while loop that prints numbers from 1 to 10, but skips multiples of 3:")
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }
}

/*
Nested loop task
Create a loop within a loop, use a range from 1 to 10 in each. Output the result of multiplying the loop variables to
the console. Output the result of the multiplication via print() and add another print(“ ”) with a space to separate the
values into a line. After the nested loop, output an empty println() so that the next pass starts with a new line.
 */

fun nestedLoop() {
    println("A nested loop:")
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(" ")
        }
        println()
    }

}