package test.추억점수_복습

class Solution {
    fun solution(names: Array<String>, yearnings: IntArray, photoes: Array<Array<String>>): IntArray {
        val map = names.zip(yearnings.toTypedArray()).toMap()
        return photoes.map { photo -> photo.sumOf { map[it] ?: 0 } }.toIntArray()
    }
}

fun main() {

    var solution = Solution()

    var name : Array<String> = arrayOf("may", "kein", "kain", "radi")
    var yearning : IntArray = intArrayOf(5, 10, 1, 3)
    var photo : Array<Array<String>> = arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))
    var answer = solution.solution(name, yearning, photo)


}