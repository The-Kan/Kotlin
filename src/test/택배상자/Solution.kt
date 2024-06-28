package test.택배상자

import java.util.LinkedList
import java.util.Queue
import java.util.Stack

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0

        var queue : Queue<Int> = LinkedList<Int>()
        var stack = Stack<Int>()
        for (i in 1..order.size){
            queue.add(i)
        }

        for (ord in order){
            var isOk = false
            while(!queue.isEmpty() && queue.peek() < ord){ // it =4
                stack.add(queue.poll()) // 1,2,3
            }

            if(queue.peek() == ord){
                queue.poll()
                answer++
                isOk = true
            }

            if(!stack.isEmpty() && stack.peek() == ord){
                stack.pop()
                answer++
                isOk = true
            }

            if(!isOk) break
        }


        return answer
    }
}

fun main() {

    var solution = Solution()
    var order = intArrayOf(10, 9, 8, 7, 4, 5, 6, 3, 2, 1)
    println(solution.solution(order))
}