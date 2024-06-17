package test.푸드파이트대회

class Solution2 {
    fun solution(food: IntArray): String {
        var sb = StringBuilder()

        for(i in 1..food.lastIndex){
            repeat(food[i] / 2){
                sb.append(i)
            }
        }

        var reserved = sb.reversed()
        sb.append("0" + reserved)

        return sb.toString()
    }
}

fun main() {

    var solution = Solution()

    var food = intArrayOf(1, 3, 4, 6)

    println(solution.solution(food))
}