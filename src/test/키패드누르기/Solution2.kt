package test.키패드누르기

import kotlin.math.abs

class Solution2 {
    fun solution(numbers: IntArray, hand: String): String {
        val info = mapOf(0 to Pair(1,3),
            1 to Pair(0,0), 2 to Pair(1,0), 3 to Pair(2,0),
            4 to Pair(0,1), 5 to Pair(1,1), 6 to Pair(2,1),
            7 to Pair(0,2), 8 to Pair(1,2), 9 to Pair(2,2))

        var leftHand = hand == "left"
        var lP = Pair(0,3)
        var rP = Pair(2,3)

        return numbers.map {
            if(info[it]!!.first == 0){
                lP = info[it]!!
                "L"
            } else if(info[it]!!.first == 2){
                rP = info[it]!!
                "R"
            } else {
                var disL = abs(lP.first - info[it]!!.first) + abs(lP.second - info[it]!!.second)
                var disR = abs(rP.first - info[it]!!.first) + abs(rP.second - info[it]!!.second)

                if(disL == disR){
                    if(leftHand){
                        lP = info[it]!!
                        "L"
                    } else{
                        rP = info[it]!!
                        "R"
                    }
                } else if(disL < disR){
                    lP = info[it]!!
                    "L"
                } else {
                    rP = info[it]!!
                    "R"
                }
            }

        }.joinToString("")

    }
}

fun main() {
    var solution = Solution2()
    var numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    var hand = "right"
    println(solution.solution(numbers,hand))
}