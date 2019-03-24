fun main(args : Array<String>){
    val obj = InterfaceImp()
    println("Variable value is : ${obj.myVar}")
    obj.sayHello()

    println(obj.absMethod())
}

interface ExampleInterface{
    var myVar : Int
    fun absMethod():String
    fun sayHello() {
        println("Hello future!")
    }
}

class InterfaceImp : ExampleInterface{
    override fun absMethod(): String {
        return "Learning Kotlin"
    }

    override fun sayHello() {
        super.sayHello()
    }
    override var myVar: Int = 10
}