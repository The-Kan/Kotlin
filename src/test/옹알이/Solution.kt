package test.옹알이

class Solution {
    fun solution(babblings: Array<String>): Int {
        // "aya", "ye", "woo", "ma" 4가지 발음만 가능
        var answer = 0
        for (i in babblings.indices) {
            if (babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains(
                    "mama"
                )
            ) {
                continue
            }

            babblings[i] = babblings[i].replace("aya", " ")
            babblings[i] = babblings[i].replace("ye", " ")
            babblings[i] = babblings[i].replace("woo", " ")
            babblings[i] = babblings[i].replace("ma", " ")
            babblings[i] = babblings[i].replace(" ", "")

            if (babblings[i].length == 0) answer++
        }
        return answer
    }
}

fun main() {


    var solution = Solution()

    //var babbling = arrayOf("aya", "yee", "u", "maa")
    var babbling = arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa")

    println(solution.solution(babbling))
}