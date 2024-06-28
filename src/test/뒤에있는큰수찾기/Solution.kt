package test.뒤에있는큰수찾기

import java.util.Stack
class Solution {

    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size)

        var stack = Stack<Int>()

        for(i in numbers.lastIndex downTo 0){
            while(!stack.isEmpty()){
                // i와 가장 가까이 있는 수 중 큰 값이 발견되면 바로 break
                if(stack.peek() > numbers[i]){
                    answer[i] = stack.peek()
                    break
                } else {
                    // 뒷 큰수를 만족하지 못하면 버린다. 어차피 stack.add(numbers[i])에서 numbers[i]가 더 큰 값으로 넣어주기 때문.
                    stack.pop()
                }
            }
            if(stack.isEmpty()){
                answer[i] = -1
            }
            // numbers[i] 는 항상 stack에 넣는다.
            stack.add(numbers[i])

        }
        return answer
    }
}

fun main() {
    var solution = Solution()
    var numbers = intArrayOf(1, 4, 2, 3, 5)

    var answer = solution.solution(numbers)

    answer.forEach {
        print("$it ")
    }


}