package com.example.helloworld



fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumSub(a: Int, b: Int) = a - b

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOfOrder(a: Int, b: Int) = if (a > b) a else b

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLengthEasy(obj: Any): Int? = if (obj is String) obj.length else null

fun main() {
    println("fuck")
    println(sum(1, 2))
    println(sumSub(2, 1));
    println(if (sum(2, 1) == 3) "fck" else "fuck")
    println(getStringLength(1))
    println(getStringLength("12138"))
    println(getStringLengthEasy("12138"))


}