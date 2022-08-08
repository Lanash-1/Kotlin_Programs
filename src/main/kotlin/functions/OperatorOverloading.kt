package functions


fun main() {
    var a1="Hello"
    println(a1 * 3)
}

operator fun String.times(i: Int): String {
    var result = ""
    for(x in 1..i){
        result += this
    }
    return result
}