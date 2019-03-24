fun main(args: Array<String>){

    //Use of If-Else Statement
    println("If-Else Statement")
    val a: Int = 2
    val b: Int = 5
    val max: Int = if (a < b) b else a
    println("Max $max")
    println("---------------------------")

    //Use of When statement that is similar to switch
    println("When Statement")
    val c: Int = 6
    when(c){
        1,2,3,4,5,6 -> println("c is between 1 to 6")

        else -> {
            println("c is not available")
        }
    }

    println("---------------------------")

    //Use of For Loop
    println("For Loop")
    val items = listOf(1,21,31)
    for ((index,value) in items.withIndex()){
        println("Index is : $index & Value : $value")
    }

    println("---------------------------")

    //Use of While and Do-While
    var x: Int = 0

    println("While Loop")
    while (x <= 10){
        println(x)
        x++
    }

    println("---------------------------")

    println("Do While Loop")
    var y: Int = 0
    do {
        y += 10
        println(y)
    }while (y < 100)

    println("---------------------------")

    //Use of Return Statement
    println("The Use of Return Statement")
    var d: Int = 5
    println("Double : " + doubleMe(d))

    println("---------------------------")

    //Use of Continue and break
    println("The Use of Continue and Break Statement")
    myLabel@ for (x in 1..10){
        if(x == 5){
            println("I'm inside the block")
            break@myLabel
        }else{
            println("In else block")
            continue@myLabel
        }
    }
}

fun doubleMe(x:Int):Int{
    return x*x;
}