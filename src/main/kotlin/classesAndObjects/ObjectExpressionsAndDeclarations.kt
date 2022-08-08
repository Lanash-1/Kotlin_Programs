package classesAndObjects

class OEAD{
    private fun getObject() = object{
        var x: Int = 5
    }

    fun printObj(){
        println(getObject().x)
    }
}

class MyName{
    companion object Show{
        fun create(): MyName = MyName()
        fun display(){
            println("")
        }
    }
}



fun main(){
    println("Object Expressions and Declarations")

    val name = object {
        val first = "lanash"
        val last = "d"
        override fun toString() = "$first $last"
    }

    println(name)

    val o = OEAD()
    o.printObj()


}