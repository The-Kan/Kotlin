package test.과일장수

import kotlin.math.min

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0

        if(m > score.size) return 0

        score.sortDescending()

        var total = 0
        var minScore = 11
        var cnt = 0
        for(score1 in score){
            cnt++
            minScore = min(minScore, score1)
            if(cnt % m == 0){
                total += minScore * m
            }

        }

        return total
    }
}

fun main() {

    var solution = Solution()
    var k = 4
    var m = 3
    var score = intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)
    println(solution.solution(k, m, score))
}