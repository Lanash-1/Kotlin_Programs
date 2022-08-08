

fun main() {
    println("Null safety")

//    Safe call (?)

    val middleName1: String? = "Rogers"
    val middleName2: String? = null



    println("Length = ${middleName1?.length}")
    println("Length = ${middleName2?.length}")


//    Safe call with let (?.let)

    middleName1?.let{
        println("(?.let) Middle name in uppercase = ${middleName1.uppercase()}")
    }

    middleName2?.let{
        println("(?.let) Middle name in uppercase = ${middleName2.uppercase()}")
    }

//    Elvis operator (?:)

    val length1: Int = middleName1?.length ?: -1

    println("length of middle name = $length1")


    val length2: Int = middleName2?.length ?: -1

    println("length of middle name = $length2")


//    Non null assertion operator (!!)   // should use only when we are sure there will be non null value

    println("middle name in upper = ${middleName1!!.uppercase()}")

    println("middle name in upper = ${middleName2!!.uppercase()}")

}