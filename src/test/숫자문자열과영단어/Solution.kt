package test.숫자문자열과영단어

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var str = s
        var map = mapOf("zero" to "0", "one" to "1", "two" to "2", "three" to "3","four" to "4",
            "five" to "5", "six" to "6", "seven" to "7", "eight" to "8", "nine" to "9")

        map.forEach {
            str = str.replace(it.key, it.value)
        }

        answer = str.toInt()

        return answer
    }
}

fun main() {
    var solution = Solution()
    var s = "one4seveneight"
    println(solution.solution(s))
}