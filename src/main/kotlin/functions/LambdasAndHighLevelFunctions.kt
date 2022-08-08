package functions


fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit){       // this is a higher order function since it has function as a parameter
    val sum = a + b
    action(sum)
}

fun main(){
    println("Lambdas and higher order functions")

    val lambdaExample: (Int) -> Unit = {sum: Int -> println(sum)}      // this is a lambda function

    addTwoNumbers(4,5,lambdaExample)

    var sum = 0
    val ints = arrayOf(1,-3,9,0)
    ints.filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)

}