
fun main(){
    println("Getting user input")

    print("Enter your name: ")
    var myName: String = readLine()!!
    var myNumber: Int = 0
    try {
        myNumber = myName.toInt()
        println("Number = $myNumber")
    } catch (error: Exception){
        println("Not a number")
    }

    println("My name is $myName")

}