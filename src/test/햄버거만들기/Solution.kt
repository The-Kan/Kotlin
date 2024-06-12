package test.햄버거만들기

import java.util.*

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0

        val stack = Stack<Int>()
        for(x in ingredient){
            stack.add(x)

            if(stack.peek() == 1 && stack.size >= 4){
                val a = stack[stack.size-4] == 1
                val b = stack[stack.size-3] == 2
                val c = stack[stack.size-2] == 3
                val d = stack[stack.size-1] == 1

                if(a && b && c && d){
                    answer++
                    repeat(4){
                        stack.pop()
                    }
                }

            }


        }


        return answer
    }
}

fun main() {

    var solution = Solution()
    var ingredient = intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)
    println(solution.solution(ingredient))
}