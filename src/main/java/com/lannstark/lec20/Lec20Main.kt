package com.lannstark.lec20

fun main() {
    val person = Person("홍길동", 100)

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: ${it}") }
        .add("four")
}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}
