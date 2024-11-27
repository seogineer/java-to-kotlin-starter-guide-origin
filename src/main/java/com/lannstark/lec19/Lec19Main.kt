package com.lannstark.lec19

fun main() {
    val numbers = listOf(1, 2, 3)
}

fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean) {

}

data class Person(
    val name: String,
    val age: Int
)

const val number = 0

fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}
