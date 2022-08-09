
fun main(){
    println("Collections\n")

    iterators()   // worked with all the methods of iteration

    listIterators()  // list can be iterated in both the directions

    mutableIterators()  // extends iterator with add, insert and removal functions

}


fun iterators(){
    val numbers = listOf("one", "two", "three", "four")

    // there are various methods to iterate over a list

//    method 1
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }


//  method 2
    for (item in numbers){
        println(item)
    }

//    method3
    numbers.forEach {
        println(it)
    }
}


fun listIterators(){
    val numbers = listOf("one", "two", "three", "four")
    val listIterator = numbers.listIterator()
    while (listIterator.hasNext()) listIterator.next()
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }
}


fun mutableIterators() {
    val numbers = mutableListOf("one", "four", "four", "five")
    val mutableListIterator = numbers.listIterator()

    mutableListIterator.next()
    mutableListIterator.add("two")
    mutableListIterator.next()
    mutableListIterator.set("three")
    mutableListIterator.next()
    mutableListIterator.next()
    mutableListIterator.remove()
    println(numbers)
}


