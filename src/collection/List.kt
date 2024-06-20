package collection

class List {

}

fun main() {

    val testList = listOf("A", "B", "C")
    val newList1 = testList.map { "$it!" }

    println(newList1) // -> [A!, B!, C!]

    val newList2 = testList.flatMap {
        "$it!".toList()
    }
    println(newList2) // -> [A, !, B, !, C, !]
}