fun main(args : Array<String>){
    val obj = myClass()
    obj.printMe()

    println(Outer().Nested().nested())

    var programmer :Human = object : Human {
        override fun think() {
            println("Anonymous class")
        }
    }
    programmer.think()
}

class myClass{
    private var name: String = "Darshit"

    fun printMe(){
        println("Name is $name")
    }
}

class Outer{
    val msg = "Message from outer class"

    inner class Nested{
        fun nested() = "$msg"
    }
}

interface Human{
    fun think()
}
