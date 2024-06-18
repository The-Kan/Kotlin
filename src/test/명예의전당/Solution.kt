package test.명예의전당

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = IntArray(score.size)


        var scoreList = mutableListOf<Int>()

        for (i in 0..score.lastIndex){
            scoreList.add(score[i])
            var descending = scoreList.sortedDescending()
            if(i >= k -1){

                answer[i] = descending.get(k-1)
                println("내림차순 O " + answer[i] )
            } else {
                answer[i] = descending[descending.lastIndex]
                println("내림차순 X " + answer[i] )
            }
        }




        return answer
    }
}

fun main() {

    var solution = Solution()

    var k = 4
    var score = intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)


    var answer = solution.solution(k, score)
    for(i in answer){
        println(i)
    }

}