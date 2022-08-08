package classesAndObjects


data class Human(val name: String, val place: String){
    var age: Int = 0
}


fun main(){
    println("Data classes\n")

    val person1 = Human("lanash", "chennai")
    person1.age = 20

    val person2 = Human("peter parker", "queens")
    person2.age = 25

    val person3 = person2.copy()
    person3.age = 30

    val person4 = person1.copy(name = "lan", place = "estancia")
    println("person4 age = ${person4.age}")

    println(person1)
    println(person1.equals(person2))
    println("person1 hashcode = ${person1.hashCode()} and person2 hashcode = ${person2.hashCode()}")

    println(person1.toString())
    println(person2.toString())

    println("person1 == person4 = ${person1.equals(person4)}")

    println("person2 == person3 = ${person2.equals(person3)}")

}