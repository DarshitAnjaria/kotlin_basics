fun main(args : Array<String>){
    val person = Person("Darshit",21)
    println("Name ${person.name} & Age ${person.age}")

    val human1 = Human1("Me",21)
    println("${human1.msg}")
}

class Person(val name : String, var age : Int){

}

class Human1(val name: String, var age: Int){
    val msg : String = "Hey there"
    constructor(name: String,age: Int,msg: String):this(name,age){}
}