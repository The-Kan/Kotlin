package test.예상대진표

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1

        var small = min(a, b)
        var big = max(a, b)

        if (small.isOdd() && big - small == 1) {
            return answer
        }

        while (true) {
            if (small.isOdd()) {
                small += 1
            }

            if (big.isOdd()) {
                big += 1
            }

            small /= 2
            big /= 2
            answer++
            if (small.isOdd() && big - small == 1) {
                break
            }
        }

        return answer
    }
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}


fun main() {
    var solution = Solution()
    var N = 16
    var a = 9
    var b = 12
    println(solution.solution(N, a, b))
}