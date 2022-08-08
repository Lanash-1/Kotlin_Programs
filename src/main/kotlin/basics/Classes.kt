package basics

open class Shape

class RectangleArea(height: Double, width: Double): Shape(){
    var area = 0.5 * height * width

    fun displayArea(): Boolean{
        println("Area of rectangle = $area")
        return true
    }
}

fun main(){
    val shape = RectangleArea(
        10.0,
        20.0
    )
    if(shape.displayArea()){
        println("Success")
    }else{
        println("Failure")
    }
}

