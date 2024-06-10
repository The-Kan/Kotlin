package dataCompare

class EqualTest {

}

fun main() {
    val a : Pair<Char, Int> = Pair('A', 65)
    val b = a
    val c : Pair<Char, Int> = Pair('A', 65)

    // a와 b 값이 동일한지 확인 ==
    val aEqualb : Boolean = a == b
    println(aEqualb)

    val aEqualC : Boolean = a == c
    println(aEqualC)

    // a와 b가 같은 객체인지 확인 ===
    val aIdenticalb : Boolean = a === b
    println(aIdenticalb)

    val aIdenticalc : Boolean = a === c
    println(aIdenticalc)
}
