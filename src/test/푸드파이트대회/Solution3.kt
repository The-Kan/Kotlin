package test.푸드파이트대회

class Solution3 {
    fun solution(food: IntArray): String {
       var answer : String = ""

       food.forEachIndexed { index, i -> if(index > 0) for(j in 1..i/2) answer+=index}

       return answer + "0" + answer.reversed()

    }
}

fun main() {

    var solution = Solution()

    var food = intArrayOf(1, 3, 4, 6)

    println(solution.solution(food))

}