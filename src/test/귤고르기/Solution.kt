package test.귤고르기


class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {

        var hashSet = tangerine.sorted().toHashSet()

        var min = k
        var hashMap = HashMap<Int, Int>()
        hashSet.forEach { num ->
            var cnt = tangerine.count { it == num }
            hashMap.put(num, cnt)
        }

        var hashMap2 = hashMap.toList().sortedWith(compareByDescending { it.second }).toMap()

        var totalSum = 0
        var cnt = 0
        for (i in hashMap2){
            cnt++
            totalSum+=i.value
            println("i.value ${i.value} cnt $cnt")
            if(totalSum >= k){
                min = cnt
                break
            }
        }

        return min
    }
}

fun main() {

    var solution = Solution()
    var k = 1
    var tangerine = intArrayOf(1, 1, 1, 1)
    println(solution.solution(k, tangerine))

}