package classesAndObjects

fun interface Sum{
    fun greater(num: Int) : Boolean
}



fun main(){
    println("Functional interfaces")

    val result = Sum {it > 0}

    println(result.greater(-5))
}