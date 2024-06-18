package test.가장가까운같은글자

class Solution3 {
    fun solution(s: String): IntArray {
        val answer = IntArray(s.length) { -1 }

        for(i in s.indices){
            val sub = s.substring(0 until i)

            val findLastIdx = sub.indexOfLast(predicate = { it == s[i] })
            if(findLastIdx != -1) answer[i] = i - findLastIdx
        }

        return answer
    }
}



fun main() {
    var solution = Solution3()
    var str = "banana"

    var intArray = solution.solution(str)

    println("정답")
    for (num in intArray){
        println(num)
    }
}