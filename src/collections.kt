fun main(args: Array<String>){
    val mtList: MutableList<Int> = mutableListOf(1,2,3)
    mtList.add(4)
    println(mtList)

    val read: List<Int> = mtList
    println(read)

    val readWriteMap = hashMapOf("hi" to 1, "there" to 2)
    println("Value for There :  " + readWriteMap["hi"])

    val stringMap = hashSetOf("a","b","c","d")
    println("Hash Set : " + stringMap)
}