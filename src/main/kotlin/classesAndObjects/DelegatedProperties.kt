package classesAndObjects

import kotlin.reflect.KProperty

class Person1{
    var name: String? by NameDelegate()
}

class NameDelegate{

    var fullName: String? = null

    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String?
    ){
        if(value != null && value != ""){
            fullName = value
        }
    }

    operator fun getValue(
        thisRef: Any?,
        property: KProperty<*>,
    ): String? {
        return fullName
    }

}

fun main(){
    println("delegated properties")

    val person = Person1()
    person.name = "lanash"
    println(person.name)

    person.name = ""
    println(person.name)

    person.name = "tony stark"
    println(person.name)
}