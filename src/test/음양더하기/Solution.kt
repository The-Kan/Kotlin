package test.음양더하기

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0
        absolutes.forEachIndexed { index, i ->
            if(signs[index]){
                sum += i
            } else {
                sum -= i
            }
        }
        return sum
    }
}

fun main() {
    var solution = Solution()
    var absolutes = intArrayOf(4,7,12)
    var signs = booleanArrayOf(true,false,true)
    println(solution.solution(absolutes, signs))
}