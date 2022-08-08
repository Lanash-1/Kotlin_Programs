package basics

fun main(){


    val items = setOf("apple", "cat", "apple")

    println(items)

    for (item in items){
        println(item)
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}