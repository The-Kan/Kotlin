package test.두개뽑아서더하기

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var ans = HashSet<Int>()

        for(i in 0..numbers.lastIndex){
            for(j in i+1..numbers.lastIndex){
                ans.add(numbers[i] + numbers[j])
            }
        }

        return ans.toIntArray().sortedArray()
    }
}

fun main() {
    var solution = Solution()

    var intArr = intArrayOf(5,0,2,7)
    var answer = solution.solution(intArr)

    for (i in answer){
        println(i)
    }
}