package test.가장가까운같은글자

class Solution {
    fun solution(s: String): IntArray {
        var answer = ArrayList<Int>()

        var temp = StringBuilder()
        for (char in s){
            temp.append(char)

            var str = temp.toString()
            println("str = $str")

            var startIdx = str.length - 1

            var lastIdx = -1

            for (i in str.length - 2   downTo 0){
                if(str.get(i) == char){
                    lastIdx = startIdx - i
                    println("i = $i" + " -- " + "${str.get(i)}")
                    println("lastIdx = $lastIdx")
                    break
                }

            }
            answer.add(lastIdx)
        }
        return answer.toIntArray()
    }

}

fun main() {
    var solution = Solution()
    var str = "foobar"


    var intArray = solution.solution(str)

    println("정답")
    for (num in intArray){
        println(num)
    }
}