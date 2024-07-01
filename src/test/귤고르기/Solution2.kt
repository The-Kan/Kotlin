package test.귤고르기

class Solution2 {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var limit = 0
        tangerine.groupBy { it }.toList().sortedByDescending { it.second.size }.forEach{
            if(limit >= k){
                return answer
            }
            limit += it.second.size
            answer++
        }

        return answer
    }
}

fun main() {

    var solution = Solution2()
    var k = 1
    var tangerine = intArrayOf(1, 1, 1, 1)
    println(solution.solution(k, tangerine))

}