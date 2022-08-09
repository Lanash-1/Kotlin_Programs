package scopeFunctions

data class AlsoExample(
    var type: Int = 0,
    var about: String = ""
)


fun main(){
    println("ALSO scope function")

    var example = AlsoExample().apply {
        type = 3
        about = "returns the context object itself and refers the context object using it keyword"
    }

    println(example)

    example = example.also {
        it.about = it.about.uppercase()
    }

    println(example)
//    println("duplicate = $duplicate")
}