package test.가장가까운같은글자

class Solution2 {
    fun solution(s: String): IntArray {
        val answer = IntArray(s.length) { -1 }
        val checkIndex = ('a'..'z').associate { it to -1 } as HashMap

        s.forEachIndexed { index, c ->
           if(checkIndex[c] != -1) answer[index] = index - checkIndex[c]!!
            checkIndex[c] = index
        }


        return answer
    }
}


fun main() {
    var solution = Solution2()
    var str = "banana"

    var intArray = solution.solution(str)

    println("정답")
    for (num in intArray){
        println(num)
    }
}