package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString().map { it.toString().toInt() }
    val min = digits.min()
    val max = digits.max()
    return min + max
}

