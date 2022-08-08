package basics

val PI = 3.14; // can be assigned at top


fun main() {
    val tita: Int  // data type is required when no value is assigned
    tita = 6

//    PI = 4.0;  --> error because val cannot be reassigned

    println("pi value is $PI")
    println("$tita -> tita value is $tita")

    println("val = ${tita+6}")

    var language = "kotlin"
    var value: Int = 5
    language = "english"

    println(language)

    var result = value + 96
    println(result)

    var type: Any

    type = 25.5

}