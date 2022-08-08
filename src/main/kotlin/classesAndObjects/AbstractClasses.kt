package classesAndObjects

abstract class Transportation(){
    abstract fun mode()

    open fun operated(){
        println("Operated by humans")
    }
}

class Ship: Transportation(){
    override fun mode(){
        println("seaways")
    }
}

class Rocket: Transportation(){
    override fun mode(){
        println("Space")
    }

    override fun operated(){
        println("Operated by AI")
    }
}

fun main(){
    println("Abstract classes")

    var vehicle: Transportation = Ship()
    vehicle.mode()
    vehicle.operated()

    vehicle = Rocket()
    vehicle.mode()
    vehicle.operated()

}