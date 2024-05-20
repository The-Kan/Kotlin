
fun main() {
    val length = 1000
    val str : String = "Length : $length "

    println(str)

    val text : String = "Lorem ipsum"

    val lengthText : String = "TextLength : ${text.length}"
    println(lengthText)

    val price : Int = 1000
    val priceText : String = "Price : ${'$'}$price"

    println(priceText)

}