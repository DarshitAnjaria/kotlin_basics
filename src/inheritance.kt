fun main(args:Array<String>){
    var a = child()
    println(a.me())
}

open class parent{
    open fun me(){
        println("Me")
    }
}

class child : parent(){
    override fun me() {
        println("Child function")
    }
}