package test.키패드누르기

import kotlin.math.abs

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = StringBuilder()

        var lx = 0
        var ly = 3
        var rx = 2
        var ry = 3

        var lList = intArrayOf(1,4,7)
        var rList = intArrayOf(3,6,9)

        // 10 = *, 11 = 0, 12 = #
        var xKeypad = arrayOf(0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2)
        var yKeypad = arrayOf(0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3)

        numbers.forEach {
            var idx = it
            if(it == 0) idx = 11

            println("it=$it idx=$idx")

            if(lList.contains(idx)){
                answer.append("L")
                lx = xKeypad[idx - 1]
                ly = yKeypad[idx - 1]
                println("lx=$lx ly=$ly")
            } else if(rList.contains(idx)) {
                answer.append("R")
                rx = xKeypad[idx-1]
                ry = yKeypad[idx-1]
                println("rx=$rx ry=$ry")
            } else { // 2 5 8 0
                // 최소거리를 찾아야한다. 최소 거리가 같다면 hand를 활용
                var minL = minDistance(lx, ly, idx, xKeypad, yKeypad)
                var minR = minDistance(rx, ry, idx, xKeypad, yKeypad)

                println("minL = $minL minR = $minR")


                if(minL == minR){
                    if(hand == "left") {
                        answer.append("L")
                        lx = xKeypad[idx - 1]
                        ly = yKeypad[idx - 1]
                    } else {
                        answer.append("R")
                        rx = xKeypad[idx-1]
                        ry = yKeypad[idx-1]
                    }
                } else if(minL < minR){
                    answer.append("L")
                    lx = xKeypad[idx - 1]
                    ly = yKeypad[idx - 1]
                } else {
                    answer.append("R")
                    rx = xKeypad[idx-1]
                    ry = yKeypad[idx-1]
                }
            }

            println("-----")
        }



        return answer.toString()
    }

    fun minDistance(x: Int, y: Int, des : Int, xKeypad: Array<Int>, yKeypad: Array<Int>) : Int{
        var desX = xKeypad[des-1]
        var desY = yKeypad[des-1]

        var dis = abs(x-desX) + abs(y-desY)

        println("x = $x y=$y desX=$desX desY=$desY dis=$dis")

        return dis
    }
}

fun main() {
    var solution = Solution()
    var numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    var hand = "right"
    println(solution.solution(numbers,hand))
}