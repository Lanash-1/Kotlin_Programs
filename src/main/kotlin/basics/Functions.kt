package basics

fun display(result: Int){
    println("Result = $result")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun addFive(a: Int): Int = a + 5

fun main(){
    println("functions")
    display(sum(5,5))
    display(addFive(20))
}