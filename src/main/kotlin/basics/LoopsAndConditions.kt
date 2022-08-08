package basics

fun main(){
    val items = listOf("apple", "banana", "carrot")
    println(items)

    for (item in items){
        println("Item == $item")
    }

    for(index in items.indices){
        if(index%2 == 1){
            println("odd index = ${items[index]}")
        }else{
            println("even index = ${items[index]}")
        }
    }

    var count = 0
    while(count < 5){
        println("count = ${count+1}")
        count++
    }


}