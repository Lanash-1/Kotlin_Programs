package controlFlow

enum class Directions{
    NORTH, EAST, WEST, SOUTH
}

fun getDirection(): Directions {
    return Directions.EAST
}

fun main(){

    val direction: String = when (getDirection()){
        Directions.NORTH -> "up"
        Directions.SOUTH -> "down"
        Directions.EAST -> "right"
        Directions.WEST -> "left"
    }

    println(direction)
}