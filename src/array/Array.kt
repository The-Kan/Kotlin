package array

fun main() {
    val words : Array<String> = arrayOf("A", "B", "C", "D")

    val mutableWords : MutableList<String> = arrayListOf("A", "B", "C" ,"D")
    mutableWords.add("E")

    println(mutableWords.get(4))
    println(mutableWords[4])

    mutableWords[0] = "F"
    println(mutableWords[0])
}