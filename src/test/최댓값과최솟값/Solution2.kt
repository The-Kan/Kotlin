package test.최댓값과최솟값

class Solution2 {
    fun solution(s: String): String {
        return s.split(" ").map { it.toInt() }.let { "${it.min()} ${it.max()}" }
    }
}

fun main() {
    var solution = Solution2()
    var s = "1 2 3 4"
    println(solution.solution(s))
}