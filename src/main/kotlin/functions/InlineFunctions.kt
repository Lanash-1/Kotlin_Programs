package functions

fun main(){
    println("Inline functions")

    inlineExample { println("calling inline function") }
}

fun inlineReturnTest(numbers: Array<Int>): Boolean{


    numbers.forEach {
        if(it == 3){
            return true
        }
    }
    return false
}



inline fun inlineExample(func: () -> Unit){
    func()
    println("inside inline function")

    val numbers = arrayOf(1,2,3,4,5)

    if(inlineReturnTest(numbers)){
        println("non local return")
    }else{
        println("false")
    }
}