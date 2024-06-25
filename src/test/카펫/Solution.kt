package test.카펫

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = IntArray(2)

        var sum = brown + yellow

        var half = sum / 2

        for (i in 2..half){
            if(sum % i == 0){
                var garo = i
                var sero = sum/i

                if((sero-2) * (garo-2) == yellow){
                    answer[0] = (garo)
                    answer[1] = (sero)
                }
            }
        }




        return answer
    }

}

fun main() {
    var solution = Solution()
    var brown = 24
    var yellow = 24

    var answer = solution.solution(brown, yellow)
    answer.forEach {
        println(it)
    }
}