package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = Regex("\\d+")
    val matches = regex.findAll(str)

    return if (matches.any()) {
        val multipliedSum = matches.sumOf { it.value.toInt() * int }
        regex.replace(str, multipliedSum.toString())
    } else {
        str + int
    }
}

