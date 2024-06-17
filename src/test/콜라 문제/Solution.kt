package test.`콜라 문제`

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0

        var empty  = n
        var full = 0

        while(true){
            if(empty < a) break

            if(empty % a == 0){
                full = empty / a * b
                answer += full
                empty = 0
            } else {
                full = empty / a * b
                answer += full
                empty = empty % a
            }

            empty = full + empty
            println(empty)
        }
        return answer
    }
}


fun main() {
    var solution = Solution()
    println("answer = ${solution.solution(3,2,20)}")
}