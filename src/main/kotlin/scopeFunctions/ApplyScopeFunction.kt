package scopeFunctions

class ApplyExample{
    var type: Int = 0
    var about: String = ""
}

fun main(){
    println("APPLY scope function")


    var example = ApplyExample().apply {
        this.type = 2
        about = "return the context object itself and refers the context object using this keyword"
    }

    with(example){
        println("$type. $about")
    }
}