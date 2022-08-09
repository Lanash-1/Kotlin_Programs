package scopeFunctions


class RunExample{
    val type: Int = 5
    val about: String = "returns lambda result and refer to context object by using 'this'"
}

// it is a combination of with and let scope functions

fun main(){
    println("RUN scope function")

    val example: RunExample? = null

    val upperWord = example?.run{
        about.uppercase()
    }

    println(upperWord)

}