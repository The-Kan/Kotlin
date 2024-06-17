package test.푸드파이트대회

class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""

        var list : MutableList<Int> = mutableListOf()

        for (i in food.indices){
            if(i>0){
                var num = food[i] / 2
                if(num > 0){
                    var range = 1..num
                    for(j in range){
                        answer = answer + i
                    }

                }
            }
        }

        answer += "0"

        var len = food.size
        for (i in food.indices){
            var idx = len-1-i
            if(idx>0){
                var num = food[idx] / 2
                if(num > 0){
                    var range = 1..num
                    for(j in range){
                        answer = answer + idx
                    }
                }
            }
        }




        return answer
    }
}

fun main() {

    var solution = Solution()

    var food = intArrayOf(1, 3, 4, 6)

    println(solution.solution(food))
}