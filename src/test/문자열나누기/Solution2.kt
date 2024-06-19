package test.문자열나누기

class Solution2 {
    fun solution(s: String): Int {
        var answer: Int = 0

        var cnt1 = 0
        var cnt2 = 0

        var init = true
        var firstChar = 'a'
        for (char in s){
            if(init){
                firstChar = char
                init = false
                cnt1++
                println("init char=$char")
                continue

            }

            if(firstChar != char){
                cnt2++
                println("firstChar != char char=$char")
            } else{
                cnt1++
                println("firstChar == char char=$char")
            }

            if(cnt1 == cnt2){
                answer++
                init = true
                cnt1 = 0
                cnt2 = 0
                println("cnt1 == cnt2 char=$char")
                continue
            }


        }

        if(cnt1 != 0 || cnt2 != 0){
            println("cnt1 != 0 || cnt2 != 0 == char char=")
            answer++
        }


        return answer
    }
}


fun main() {

    var solution = Solution2()
    // aaaabbbcaaaa -> 2
    var s = "aaaabbbcaaaa"
    println(solution.solution(s))
}