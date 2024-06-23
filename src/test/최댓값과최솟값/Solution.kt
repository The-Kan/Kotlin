package test.최댓값과최솟값

class Solution {
    fun solution(s: String): String {
        var sb = StringBuilder()
        var list = s.split(" ").map { it.toInt() }.sorted()
        var answer = sb.append(list[0]).append(" ").append(list[list.lastIndex])
        return answer.toString()
    }
}

fun main() {
    var solution = Solution()
    var s = "1 2 3 4"
    println(solution.solution(s))
}