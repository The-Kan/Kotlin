package test.이진변환반복하기

class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = IntArray(2)

        var totalCnt = 0
        var idx = 0
        var str = s
        while (true){
            var cnt = 0

            if(str == "1"){
                break
            }

            str = str.map {
                if(it == '0'){
                    cnt++
                    ""
                } else {
                    it
                }

            }.joinToString("")

            totalCnt += cnt
            str = Integer.toBinaryString(str.length)

            println("cnt $cnt str $str")
            idx++
        }

        answer[0] = idx
        answer[1] = totalCnt


        return answer
    }
}

fun main() {
    var solution = Solution()

    var s = "1"
    var answer = solution.solution(s)

    for (i in answer){
        println(i)
    }

}