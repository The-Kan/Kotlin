package test.멀리뛰기

class Solution {
    val MOD = 1234567
    var RES = Array<Long>(2001){-1L}

    fun solution(n: Int): Long {


        return move(n)
    }

    fun move(n: Int) : Long{
        if(n==0) return 0L
        if(n==1) return 1L
        if(n==2) return 2L

        if(RES[n] != -1L) return RES[n]

        var sum = 0L
        sum += move(n-1) % MOD
        sum += move(n-2) % MOD

        RES[n] = sum % MOD
        return RES[n]
    }

}

fun main() {

    var solution = Solution()
    var n = 2
    println(solution.solution(n))

}