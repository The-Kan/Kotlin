package test.기사단원의무기

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        var range = 1..number

        // 약수의 개수를 구하는 방법으로 N의 약수 개수를 알고 싶다면 루트N의 약수 개수를 통해 알 수 있다.

        for(i in range){
            var sqrt = Math.floor(Math.sqrt(i.toDouble())).toInt()
            var range2 = 1..sqrt

            var count = 0
            for(j in range2){
                if(i % j == 0){
                    count+=2  // 16의 약수라고 4의 약수 개수를 알아야 한다. 1,2,4,8,16     4를 기준으로 왼쪽 1,2,4  오른쪽 4, 8,16 이 있으므로 +2개씩 더해준다.
                    if(i/j == j){
                        count-=1 // 4가 중복계산 되었으므로 1개를 빼준다.
                    }
                }
            }
            if(count > limit) answer += power
            else answer += count
        }
        return answer
    }
}

fun main() {
    var solution = Solution()
    var number = 10
    var limit = 3
    var power = 2

    println("solution = " + solution.solution(number, limit, power))
}