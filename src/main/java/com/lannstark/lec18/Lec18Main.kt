package com.lannstark.lec18;

import java.util.*

fun main() {

    val fruits = Arrays.asList(
        Fruit(1, "사과", 1000, 1400),
        Fruit(2, "사과", 1200, 1400),
        Fruit(3, "사과", 1200, null),
        Fruit(4, "사과", 1500, 1600),
        Fruit(5, "바나나", 3000, 3400),
        Fruit(6, "바나나", 3200, 3500),
        Fruit(7, "바나나", 2500, 2800),
        Fruit(8, "수박", 10000, 12000)
    )

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(5L, "바나나", 3_000, 3_200),
            Fruit(6L, "바나나", 3_200, 3_200),
            Fruit(7L, "바나나", 2_500, 3_200),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000),
        ),
    )

}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)
