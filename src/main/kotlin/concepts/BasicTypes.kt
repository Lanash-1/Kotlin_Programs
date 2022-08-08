package concepts

fun numberRepresentationOnTheJVM(){
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true because integers between -128 to 127 are same objects while using nullable
    println(boxedB === anotherBoxedB) // false because integers above the byte range are different objects while using nullable

    println(boxedA == anotherBoxedA) // values will be equal.
    println(boxedB == anotherBoxedB) // only the objects will be different for integers above byte range while using nullable

    var one: Int = 1000
    var anotherOne: Int = one
    var otherOne: Int = one

    println(anotherOne === otherOne)
    println(one === anotherOne)

}

fun explicitConvertion (){
    var decimalNumber: Float = 2.45F

//    var anotherDecimalNumber: Double = decimalNumber  // error because implicit conversion cannot not supported

    var anotherDecimalNumber: Double = decimalNumber.toDouble()  // explicit conversion can be done

    println(anotherDecimalNumber)


}

fun booleans(){
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = myTrue
    val anotherBoolNull: Boolean? = myTrue

    println("is same object reference = ${boolNull === anotherBoolNull}")

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}

fun strings(){
    var str = "abcd"
    println(str.uppercase()) // Create and print a new String object
    println(str) // the original string remains the same

    str = str.uppercase()
    println(str)

    for (ch in str)
        println("character == $ch")


    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin() // | acts as default margin prefix but we can add our own prefix example: trimMargin("-")

    println(text)
}

fun arrays(){
    var numbers = arrayOf(1,2,3,4,5)
    println(numbers.get(2))
    numbers.set(4,6)
    numbers.forEach { println(it) }
    val iterator = numbers.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }
}

fun main() {

    numberRepresentationOnTheJVM()

    println()

    explicitConvertion()

    println()

    booleans()

    println()

    strings()

    println()

    arrays()

}