package test.명예의전당

import java.util.PriorityQueue

class Solution3 {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        var pq = PriorityQueue<Int>()

        for(item in score){
            if(pq.size < k){
                pq.add(item)
            } else if(pq.peek() < item){
                pq.add(item)
                pq.poll()
            }
            answer.add(pq.peek())
        }


        return answer.toIntArray()
    }
}

fun main() {

    var solution = Solution3()

    var k = 4
    var score = intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)

    var answer = solution.solution(k, score)
    for(i in answer){
        println(i)
    }

}