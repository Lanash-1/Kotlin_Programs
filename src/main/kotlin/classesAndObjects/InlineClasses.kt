package classesAndObjects

@JvmInline
value class Username(val username: String)

@JvmInline
value class Password(val password: String)

fun login(uname:String,pass:String){
    if(uname=="Hello"&&pass=="1234"){
        println("Login Succesful")
    }else{
        println("Invalid")
    }
}

fun loginUsingInline(username: Username,password: Password){
    if(username == Username("Hello") && password == Password("1234")){
        println("Login Succesful")
    }else{
        println("Invalid")
    }
}

fun main() {

    var userName="Hello"
    var password="1234"
    login(userName,password)
    login(password,userName)

    var username=Username("Hello")
    var pass=Password("1234")

    loginUsingInline(username,pass)

    System.out.println(username)
//    loginUsingInline(pass,username) // error since parameters type cannot be differed
}