package basics

fun main(){
    if(5 in 1..5){
        println("contains")
    }

    val items = listOf("apple", "banana", "carrot")

    if(1 in 0..items.lastIndex){
        println("contains in list")
    }

    println(items.size)
    println(items.indices)

    if (items.size !in items.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..5) {
        print(x)
    }

    println()

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}