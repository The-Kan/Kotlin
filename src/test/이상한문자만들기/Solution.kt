package test.이상한문자만들기

class Solution {
    fun solution(s: String): String {
        return s.split(" ").map {
            var sb = StringBuilder()
            it.forEachIndexed { index, c ->
                if(index % 2 == 0){
                    sb.append(c.uppercase())
                } else {
                    sb.append(c.lowercase())
                }
            }
            sb.toString()
        }.joinToString(" ")
    }
}

fun main() {
    var solution = Solution()
    var str = "try hello world"
    println(solution.solution(str))
}