package test.호텔대실

import kotlin.math.max

class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0

        // 23:59

        var arr = IntArray(1440) {0}
        book_time.forEach {
            var list = it[0].split(":")
            var startMin = list[0].toInt()*60 + list[1].toInt()
            list = it[1].split(":")
            var endMin = list[0].toInt()*60 + list[1].toInt() + 9




            if(endMin / 1439 > 0){
                for (i in 0..(endMin % 1439)-1){
                    arr[i]++
                }

                for (i in startMin..1439){
                    arr[i]++
                }

            } else {
                for(i in startMin..endMin){
                    arr[i]++
                }
            }
        }

        arr.forEachIndexed { index, i ->
            answer = max(answer, i)
            print(i)
        }
        println()

        return answer
    }
}

fun main() {
    var solution = Solution()
    //var book_time = arrayOf(arrayOf("15:00", "17:00"), arrayOf("16:40", "18:20"), arrayOf("14:20", "15:20"), arrayOf("14:10", "19:20"), arrayOf("18:20", "21:20"))
//    var book_time = arrayOf(arrayOf("09:10", "10:10"), arrayOf("10:20", "12:20"))
    var book_time = arrayOf(arrayOf("00:00", "00:01"), arrayOf("22:50", "23:51"), arrayOf("10:32", "10:42"))

    println(solution.solution(book_time))


}