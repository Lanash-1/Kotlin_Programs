package basics

fun numbers(num: Int): String{
    when(num){
        1 -> return "one"
        2 -> return "two"
        3 -> return "three"
        else -> return "not 1,2 or 3"
    }
}

fun alphabets(alphabet: String){
    when(alphabet){
        "a" -> println("apple")
        "b" -> println("ball")
        "c" -> println("cat")
        else -> println("others")
    }
}

fun main(){

    var number = 1
    var alpha = "c"

    println(numbers(number))
    println(numbers(9))

    alphabets(alpha)
    alphabets("z")

}