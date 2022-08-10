package basics

fun parseInt(str: String?): Int? {
    if(str != null){
        return Integer.parseInt(str)
    }
    return null
}

fun main(){

//    var str: String = null --> throws error since it cannot be assinged null
    var str: String? = null // does not give error because ? is used

    println(parseInt("2"))
    println(parseInt(null))

}