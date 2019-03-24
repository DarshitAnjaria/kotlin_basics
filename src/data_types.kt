import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>){
    val integer: Int = 10
    val value: String = "Hello, Future!"
    val double_val: Double = 5.5
    val long_val: Long = 1200000
    val boolean_val: Boolean = true
    val ch: Char = 'L'
    val arr: IntArray = intArrayOf(1,2,3,4,5,6,7)
    val stringArr : Array<String> = arrayOf("Hey", "There")

    println("The Integer Value is : $integer")
    println("The String is : $value")
    println("The Double value is : $double_val")
    println("Long Value : $long_val")
    println("Boolean : $boolean_val")
    println("Character is : $ch")
    println(arr.forEach { System.out.print(it) })
    println(stringArr.forEach { System.out.print(it) })

}