package scopePackage

class WithExample{
    val type: Int = 1
    val about: String = "returns lambda result and refer to context object by using 'this'"
}

fun main(){
//    println("WITH scope function")

    val example = WithExample()

    val typeName: String = with(example) {
        println("$type. ${this.about}")     // this keyword is optional because internally this is present
        "WITH scope function"
    }

    println("$typeName")
}