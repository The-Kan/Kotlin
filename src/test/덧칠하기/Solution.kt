package test.덧칠하기

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0

        var lastX = 0;
        for (sectionInt in section){
            if(sectionInt <= lastX) continue
            lastX = sectionInt + m - 1
            answer++
        }

        return answer
    }
}

fun main() {

    var solution : Solution = Solution()

    var n = 8
    var m = 4
    var section = intArrayOf(2, 3, 6)

    println(solution.solution(n, m, section))

}