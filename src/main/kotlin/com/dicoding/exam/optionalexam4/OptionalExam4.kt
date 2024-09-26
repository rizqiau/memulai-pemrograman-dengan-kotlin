package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val middle = string.length / 2
    return if (string.length %2 == 0) {
        string.substring(middle - 1, middle + 1)
    } else {
        string [middle].toString()
    }
}
