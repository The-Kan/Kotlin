package Array

fun main() {
    val words : Array<String> = arrayOf("A", "B", "C", "D")

    val mutableWords : MutableList<String> = arrayListOf("A", "B", "C" ,"D")
    mutableWords.add("E")

    println(mutableWords.get(4))
}