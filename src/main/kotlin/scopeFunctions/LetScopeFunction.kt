package scopeFunctions


data class LetExample(val numbers: Array<Int> = arrayOf(1,3,66,35,32,15,9,5), val word: String? = null)

fun main(){
    println("LET scope function")

    val example = LetExample()

    example.numbers.filter { it%2 == 0 }.let { println(it) }

    val upperWord = example.word?.let {
        it.uppercase()
    }

    println(upperWord)
}