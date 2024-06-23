package test.JadenCase문자열만들기

class Solution {
    fun solution(s: String): String {
        return s.lowercase().split(" ").map() {
            it.capitalize()
        }.joinToString(" ")
    }


}

fun main() {
    var solution = Solution()
    var s = "3people unFollowed     me"
    println(solution.solution(s))
}