package test.광물캐기

import kotlin.math.min

class Solution {

    fun solution(picks: IntArray, minerals: Array<String>): Int {
        var answer: Int = 0

        // 0 다이아몬드 1 철 2 돌
        var tired = arrayOf(arrayOf(1, 1, 1), arrayOf(5, 1, 1), arrayOf(25, 5, 1))
        // 0,0  다이아몬드 곡괭이로 다이아몬드 광물을 캐는 경우 tired[0][0]
        // 0,1 다이아몬드 곡괭이로 철 광물을 캐는 경우 tired[0][1]
        var map = mapOf("diamond" to 0, "iron" to 1, "stone" to 2)


        // 돌로 캔다고 가정하고 5개 묶음을 내림차순 정렬한다. 5개 묶음 개수보다 곡괭이수가 적은 경우 곡괭이수만큼만 캔다.
        // 다이아 -> 철 -> 돌 순서대로 캔다. 그럼 최소값을 구할 수 있다.

        var sumList = Array(10, { Array(3, {0}) })

        var diaSum = 0
        var ironSum = 0
        var stoneSum = 0

        var cnt = 0
        var group = picks.sum()


        run breaker@{
            minerals.forEachIndexed { index, s ->
                println("idx = $index s = $s")

                diaSum += tired[0][map[s]!!]
                ironSum += tired[1][map[s]!!]
                stoneSum += tired[2][map[s]!!]

                if(index % 5 == 4){
                    sumList[cnt][0] = diaSum
                    diaSum = 0
                    sumList[cnt][1] = ironSum
                    ironSum = 0
                    sumList[cnt][2] = stoneSum
                    stoneSum = 0
                    cnt++
                } else if(index == minerals.lastIndex){
                    sumList[cnt][0] = diaSum
                    diaSum = 0
                    sumList[cnt][1] = ironSum
                    ironSum = 0
                    sumList[cnt][2] = stoneSum
                    stoneSum = 0
                    cnt++
                }
                if(cnt >= group) return@breaker
            }
        }



        sumList.sortByDescending { it[2] }


        for (i in sumList){
            println("${i[0]} ${i[1]} ${i[2]}")
            if(picks[0] > 0) {
                answer+=i[0]
                picks[0]--
            } else if(picks[1] > 0) {
                answer+=i[1]
                picks[1]--
            } else if(picks[2] > 0){
                answer+=i[2]
                picks[2]--
            }
        }

        return answer
    }


}

fun main() {
    var solution = Solution()

    var picks = intArrayOf(0, 1, 0)
    var minerals = arrayOf("stone", "stone", "stone", "stone", "stone")
    println(solution.solution(picks, minerals))
}