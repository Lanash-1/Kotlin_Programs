package classesAndObjects

//interface Inheritance {
//    fun learn()
//    fun display()
//}
//
//class Concept: Inheritance{
//
//    override fun display(){
//        println("inside display")
//    }
//
//    override fun learn() {
//        println("learning")
//
//    }
//}
//
//fun main(){
//    println("Inheritance")
//
//    var concept: Inheritance = Concept()
//    concept.learn()
//    concept.display()
//}


open class R {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle: R() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}

fun main() {
    val fr = FilledRectangle()
    fr.draw()
}