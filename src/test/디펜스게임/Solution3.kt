package test.디펜스게임

import java.util.Collections
import java.util.PriorityQueue

class Solution3 {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var answer = 0
        var pq = PriorityQueue<Int>(Collections.reverseOrder())

        var N = n
        var K = k
        for(e in enemy){
            pq.add(e)
            N-=e

            while(N<0 && K>0){
                N+= pq.poll()
                K--
            }
            if(N<0) break

            answer++
        }

        return answer
    }
}

fun main() {
    var solution = Solution3()

    var n = 2
    var k = 4
    var enemy = intArrayOf(3, 3, 3, 3)
    println(solution.solution(n, k, enemy))

}