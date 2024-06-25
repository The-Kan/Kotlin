package test.롤케이크자르기

class Solution {
    var left = ArrayList<Int>()
    var right = ArrayList<Int>()

    // 시간초과 잘못된 풀이.
    fun solution(topping: IntArray): Int {
        var answer: Int = 0


        var half = divide(topping, 0, topping.lastIndex)

        if(half == -1) return 0

        answer = 1
        var left2 = ArrayList(left)
        var right2 = ArrayList(right)
        // 오른쪽 더하기
        for(i in half+1..topping.lastIndex){
            if(left.contains(topping[i]) && right.contains(topping[i])){
                println("오른쪽 더하기 ${topping[i]}")
                answer++
                left.add(topping[i])
                right.remove(topping[i])
            } else {
                break
            }
        }


        // 왼쪽 더하기
        for(i in half downTo 0){
            if(left2.contains(topping[i]) && right2.contains(topping[i])){
                left2.forEach {
                    println("남은 왼쪽 $it")
                }

                right2.forEach {
                    println("남은 오른쪽 $it")
                }

                println("왼쪽 더하기 ${topping[i]}")
                left2.remove(topping[i])
                right2.add(topping[i])
                answer++
            } else {
                break
            }
        }



        return answer
    }

    private fun divide(topping: IntArray, startIdx: Int, lastIndex: Int) : Int {

        var half = (startIdx + lastIndex)/2

        println("$startIdx $lastIndex $half 초입")

        left.clear()
        for(i in 0..half){
            left.add(topping[i])
        }

        right.clear()
        for(i in half+1..topping.lastIndex){
            right.add(topping[i])
        }

        var leftSetSize = left.toSet().size
        var rightSetSize = right.toSet().size
        if(startIdx == lastIndex){
            if(leftSetSize == rightSetSize){
                return half
            } else {
                return -1
            }
        }

        if(leftSetSize > rightSetSize){
            println("왼쪽")
            return divide(topping, startIdx, half)
        } else if(leftSetSize < rightSetSize){
            println("오른쪽")
            return divide(topping, half+1, lastIndex)
        } else {
            println("마무리 start $startIdx lastIdx $lastIndex")
            left.toSet().forEach {
                println("왼쪽 $it")
            }

            right.toSet().forEach {
                println("오른쪽 $it")
            }
            return half
        }
    }

}

fun main() {
    var solution = Solution()
    var topping = intArrayOf(1, 2, 1, 3, 1, 4, 1, 2)
    //var topping = intArrayOf(1, 2, 3, 1, 4)
    println(solution.solution(topping))
}