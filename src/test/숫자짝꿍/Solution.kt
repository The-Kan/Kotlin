package test.숫자짝꿍


class Solution {
    fun solution(X: String, Y: String): String {
        var answerStringBuilder = StringBuilder()
        var answer = ArrayList<Int>()

        var xTemp = IntArray(10) {0}
        var yTemp = IntArray(10) {0}

        for(c in X){
            xTemp[c.digitToInt()]++
        }

        for(c in Y){
            yTemp[c.digitToInt()]++
        }

        for(i in 0..9){
            if(xTemp[i] > yTemp[i]){
                repeat(yTemp[i]){
                    answer.add(i)
                }
            } else {
                repeat(xTemp[i]){
                    answer.add(i)
                }
            }
        }

        if(answer.size == 0){
            answer.add(-1)
        }


        answer.sortedDescending().forEach { answerStringBuilder.append(it) }

        if(answerStringBuilder.toString()[0] == '0'){
            return "0"
        }


        return answerStringBuilder.toString()
    }
}


fun main() {
    var solution = Solution()
    var x  = "10001"
    var y = "1040"
    println("정답 = ${solution.solution(x, y)}")
}