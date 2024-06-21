package test.문자열내마음대로정렬하기

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        // it[n]을 우선순위로 정렬 후 그 다음 it를 기준으로 정렬.
        return strings.sortedWith(compareBy({it[n]}, {it})).toTypedArray()
    }
}

fun main() {
    var solution = Solution()

    var strings = arrayOf("sun", "bed", "car")
    var n = 1
    var answer = solution.solution(strings, n)

    answer.forEach { println(it) }


}