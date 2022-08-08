package classesAndObjects

class Access private constructor(val a: Int){

    fun display(){
        println("number is $a")
    }

    companion object{
        fun getInstance() = Access(7)

    }
}

fun main(){

    val instance = Access.getInstance()

    instance.display()
}

