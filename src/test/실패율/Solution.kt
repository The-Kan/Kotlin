package test.실패율

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = ArrayList<Int> ()

        var stageUser = IntArray(N+1) {0}
        var stageSuccess = IntArray(N+1) {0}

        for(i in stages){
            for (j in 1..i){
                if(j > N) continue

                if(j==i) {
                    stageUser[j]++
                } else {
                    stageUser[j]++
                    stageSuccess[j]++
                }
            }
        }

        var hashmap : HashMap<Int, Double> = HashMap()

        for(i in 1..N){
            if(stageUser[i] == 0){
                hashmap.put(i, 0.0)
                continue
            }

            var fail = (stageUser[i].toDouble()-stageSuccess[i])/stageUser[i]
            hashmap.put(i, fail)
        }

        hashmap = hashmap.toList().sortedByDescending  { it.second }.toMap() as HashMap

        for(i in hashmap){
            println("${i.key} dddd ${i.value}")
            answer.add(i.key)
        }

        println("--------")



        return answer.toIntArray()
    }
}

fun main() {
    var solution = Solution()
    var N = 5
    var stages = intArrayOf(2,1,2, 3, 3, 3)

    var answer = solution.solution(N,stages)

    answer.forEach { println(it) }

}