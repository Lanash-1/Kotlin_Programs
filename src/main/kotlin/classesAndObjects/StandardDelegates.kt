package classesAndObjects

import kotlin.properties.Delegates

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

class User {
    var name: String by Delegates.observable("empty") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

class User2 {
    var age: Int by Delegates.vetoable(18) {property, oldValue, newValue ->
        println("$oldValue -> $newValue")
        newValue > 18
    }
}

fun main() {
    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"

    val user2 = User2()
    user2.age = 15
    user2.age = 20
}