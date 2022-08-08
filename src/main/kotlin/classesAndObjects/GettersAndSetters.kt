package classesAndObjects

class Rect(val l: Int, val b: Int){

    val area: Int
        get() = l * b

}

class P{

    var name: String = "unknown"
        get() = field
        set(value){
            field = value
        }
}

fun main(){
    println("setters and getters")

    val rect = Rect(5,10)
    println(rect.area)

    val person = P()
    println(person.name)
    person.name = "lanash"
    println(person.name)
}