fun main() {
    var a3 = Alien()
    a3.skills = "Kotlin"

    var a5 = Alien()
    a5.skills = a3.addSkills(a3)
    a5.printSkill()
}

class Alien{
    var skills : String = "null";

    fun printSkill(){
        println(skills)
    }
}

fun Alien.addSkills(a : Alien):String{
    var a1 = Alien()
    a1.skills = this.skills + " " +a.skills
    return a1.skills
}

