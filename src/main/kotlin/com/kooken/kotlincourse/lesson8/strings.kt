package com.kooken.kotlincourse.lesson8

fun main() {
    println(transformPhrase("Mission impossible"))
    println(transformPhrase("I'm not sure about anything"))
    println(transformPhrase("What a disaster!"))
    println(transformPhrase("I can do this no problem"))
    println(transformPhrase("weirdo"))
    println(extractDate("User logged in -> 2021-12-01 09:48:23"))
    println(maskCardNumber("4539 1488 0343 6467"))
    println(formatEmail("username@example.com"))
    println(extractFileName("C:/Users/Documents/report.txt"))
    println(createAbbreviation("Object-Oriented Programming"))
}

// Rules of Verification and Transformation
/*
If the phrase contains the word "impossible" - replace "impossible" with "definitely possible, just takes time"
If the phrase begins with "I'm not sure" - add ", but my gut tells me otherwise" to the end of the phrase
If the phrase contains the word "disaster" - replace "disaster" with "interesting event"
If the phrase ends with "no problem" - replace "no problem" with "with a few interesting challenges along the way"
If the phrase contains only one word - add "sometimes" before and "but not always" after.
 */

fun transformPhrase(phrase: String): String {
    return when {
        phrase.contains("impossible", ignoreCase = true) -> {
            phrase.replace("impossible", "definitely possible, just takes time", ignoreCase = true)
        }

        phrase.startsWith("I'm not sure", ignoreCase = true) -> {
            phrase + ", but my gut tells me otherwise"
        }

        phrase.contains("disaster", ignoreCase = true) -> {
            phrase.replace("disaster", "interesting event", ignoreCase = true)
        }

        phrase.endsWith("no problem", ignoreCase = true) -> {
            phrase.replace("no problem", "with a few interesting challenges along the way", ignoreCase = true)
        }

        phrase.split(" ").size == 1 -> {
            "Sometimes, $phrase, but not always"
        }

        else -> phrase // returning the initial phrase;
    }
}

/*
Task 1: Extract Date from Log String. Use indexOf or split to get the right part of the message.
Description: You have a log string like "User logged in -> 2021-12-01 09:48:23".
Extract the date and time separately from this string and print them one by one.
 */

fun extractDate(log: String): String {
    val parts = log.split("->")
    val dateTime = parts[1].trim()
    val date = dateTime.split(" ")[0]
    val time = dateTime.split(" ")[1]
    return "Date: $date\nTime: $time"
}

/*
Task 2: Masking Personal Data
Description: Given a string with a credit card number "4539 1488 0343 6467".
Mask all digits except the last four with the symbols "*".
 */

fun maskCardNumber(cardNumber: String): String {
    val lastFourDigits = cardNumber.takeLast(4)
    val maskedPart = cardNumber.dropLast(4).replace(Regex("\\d"), "*")
    return maskedPart + lastFourDigits
}

/*
Task 3: Formatting an Email Address. Use replace
Description: You have an email address "username@example.com".
Convert it to the string "username [at] example [dot] com".
 */

fun formatEmail(email: String): String {
    return email.replace("@", " [at] ").replace(".", " [dot] ")
}

/*
Task 4: Extract File Name from Path
Description: Given the path to the file "C:/Users/Documents/report.txt".
Extract the file name with the extension.
 */

fun extractFileName(filePath: String): String {
    return filePath.substringAfterLast("/")
}

/*
Task 5: Create an Abbreviation from a Phrase. Use split with a set of characters to split.
Use for to loop through the words. Use a var variable to accumulate the first letters.
Description: You have a phrase, such as "Object-Oriented Programming"
Create an acronym from the first letters of the words (e.g. "OOP").
 */

fun createAbbreviation(phrase: String): String {
    val words = phrase.split(" ", "-", "_")
    var abbreviation = ""

    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word.first().uppercaseChar()
        }
    }

    return abbreviation
}
