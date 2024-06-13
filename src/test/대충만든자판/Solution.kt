package test.대충만든자판

import kotlin.math.min

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = IntArray(targets.size)

        var idx = 0;
        for (str in targets) {

            var total = 0
            for (char in str) {

                var minTouch = 101;
                println("char = $char")

                for (str2 in keymap) {

                    var firstIdx = str2.indexOfFirst { it == char }
                    if (firstIdx == -1) continue
                    println("firstIdx = $firstIdx")
                    minTouch = min(minTouch, firstIdx + 1)
                }

                if (minTouch != 101) total += minTouch
                else {
                    total = 0
                    break
                }
                println("minTouch = $minTouch")
            }

            if (total == 0) total = -1
            answer[idx++] = total;
        }

        return answer
    }
}

fun main() {

    var solution = Solution()

    var keymap = arrayOf("ABACDZ", "BCEFZD", "BCEZD")
    var targets = arrayOf("Z", "Z", "G", "ZHG")
    var intArray = solution.solution(keymap, targets)

    for (i in intArray) {
        println(i)
    }
}