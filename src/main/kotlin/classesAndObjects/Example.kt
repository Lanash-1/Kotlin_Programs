package classesAndObjects

class Person (n: String){

    var age: Int = 0
    var name: String = n
    var year: String = "----"


    constructor(
        age: Int,
        n: String
    ) : this(n)
    {
        println("Name is $name")
        this.age = age
    }

    constructor(
        year: String,
        n: String
    ) : this(n)
    {
        this.year = year
        println("last : $name")
    }

    init {
        println("person is created")
    }

    fun display(){
        println("Your Firstname is $name")
        println("Age : $age")
        println("year: $year")
    }
}

class Employee (val empId: String){

    fun display(){
        println("Your empId is $empId")
    }
}

fun main(){
    println("Classes and objects")

    val person = Person(20, "lanash")
    person.display()

    val employee = Employee("uid01")
    employee.display()

    val person2 = Person("2001", "d")
    person2.display()

}