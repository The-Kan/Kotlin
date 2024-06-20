package test.삼총사

class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0

        for(i in 0..number.lastIndex){
            for(j in i+1..number.lastIndex){
                for(k in j+1..number.lastIndex){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++
                    }
                }
            }
        }



        return answer
    }
}

fun main() {

    var solution = Solution()
    var number = intArrayOf(-1, 1, -1, 1)
    println(solution.solution(number))
}