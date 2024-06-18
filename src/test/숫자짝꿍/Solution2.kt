package test.숫자짝꿍

import kotlin.math.min


class Solution2 {
    fun solution(X: String, Y: String): String {
       var answer : String = ""

        // 9~0 까지 List로 바꾼 후 모든 원소를 String으로 바꿈, ch는 String
        for(ch in (9 downTo 0).toList().map {it.toString()} ){
            // String.repeat(n)은 String을 n번 연속한 문자열을 만듬.
            // String.count((Char) -> Boolean) 함수인자를 만족하는 개수를 리턴
            answer += ch.repeat(min(X.count { it.toString() == ch }, Y.count { it.toString() == ch }))
        }

        if(answer.isEmpty()) answer ="-1"
        if(answer.startsWith("0")) answer ="0"

        return answer
    }
}


fun main() {
    var solution = Solution2()
    var x  = "000"
    var y = "1040"
    println("정답 = ${solution.solution(x, y)}")
}