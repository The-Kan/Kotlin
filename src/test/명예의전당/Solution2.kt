package test.명예의전당

class Solution2 {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = IntArray(score.size)

        var scoreList = mutableListOf<Int>()

        score.forEachIndexed { index, i ->
            scoreList.add(i)
            var scoreList2 = scoreList.sortedDescending()
            if (index >= k - 1) {
                answer[index] = scoreList2.get(k - 1)
            } else {
                answer[index] = scoreList2.get(index)
            }
        }


        return answer
    }
}

fun main() {

    var solution = Solution2()

    var k = 4
    var score = intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)

    var answer = solution.solution(k, score)
    for(i in answer){
        println(i)
    }

}