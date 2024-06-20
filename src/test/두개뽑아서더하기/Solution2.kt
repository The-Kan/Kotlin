package test.두개뽑아서더하기

class Solution2 {
    fun solution(numbers: IntArray): IntArray {
        return numbers.toList().withIndex().flatMap { i -> numbers.toList().withIndex().map { j -> i to j }}
            .filter { it.first.index != it.second.index }
            .map { it.first.value + it.second.value }
            .toSortedSet()
            .toIntArray()
    }
}


fun main() {
    var solution = Solution2()

    var intArr = intArrayOf(5,0,2,7)
    var answer = solution.solution(intArr)

    for (i in answer){
        println(i)
    }
}