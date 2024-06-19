package test.문자열나누기

class Solution {

    // 잘못 이해한 풀이
    fun solution(s: String): Int {
        var answer: Int = 0
        var list = ('a'..'z').toList().map { it.code }
        var arrayInt = IntArray(list.size) {0}


        for (char in s){
            arrayInt[char.code-'a'.code]++

            println("char = $char")
            if(isStop(arrayInt)){
                arrayInt = IntArray(list.size) {0}
                answer++
            }
        }

        var last = true
        arrayInt.forEach { if(it!=0) last=false}

        if(!last) answer++

        return answer
    }

    private fun isStop(arrayInt: IntArray): Boolean {

        for(i in 0..arrayInt.lastIndex){

            if(arrayInt[i]==0) continue

            println("i=$i arrayInt[i]=${arrayInt[i]}")
            for(j in i+1..arrayInt.lastIndex){
                if(arrayInt[j]==0) continue

                if(arrayInt[i]==arrayInt[j]){
                    println("같아")
                    return true
                }
            }
        }

        println("달라")

        return false
    }
}

fun main() {

    var solution = Solution()
    // aaaabbbcaaaa -> 2
    var s = "aaaabbbcaaaa"
    println(solution.solution(s))
}