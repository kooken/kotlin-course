package com.kooken.kotlincourse.lesson9

fun main() {
    val name = "Саша"
    val isTeachingKotlin = true

    println("С Днем Рождения, $name!")

    if (isTeachingKotlin) {
        println("Желаю тебе написать идеальный код без багов 🐞")
        println("Пусть ученики всегда понимают Kotlin с первого раза 👩🏻‍💻")
    } else {
        println("Желаю много радости и успехов во всех начинаниях!")
    }

    val cakeSlices = (1..100).random()
    println("И да, тебе полагается $cakeSlices кусочков торта 🎂. Но не забудь делиться 👀")

    println("Пусть твой код компилируется с первой попытки, а ошибки будут только в примерах для учеников 🥺")
}
