package test.롤케이크자르기

class Solution2 {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0

        var arr1 = IntArray(topping.size){0}
        var arr2 = IntArray(topping.size){0}

        var hashSet = HashSet<Int>()

        for(i in 0..topping.lastIndex){
            hashSet.add(topping[i])
            arr1[i] = hashSet.size
        }
        hashSet.clear()
        for(i in topping.lastIndex downTo 0){
            println(topping[i])
            hashSet.add(topping[i])
            arr2[i] = hashSet.size
        }

        for (i in 1..topping.lastIndex-1){
            if(arr1[i] == arr2[i+1]){
                answer++
            }
        }

        return answer
    }
}

fun main() {
    var solution = Solution2()
    var topping = intArrayOf(1, 2, 1, 3, 1, 4, 1, 2)
    //var topping = intArrayOf(1, 2, 3, 1, 4)
    println(solution.solution(topping))
}