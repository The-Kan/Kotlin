package test.실패율

class Solution2 {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = ArrayList<Int>()

        var hashmap: HashMap<Int, Double> = HashMap()

        for (i in 1..N) {

            var success = 0
            var user = 0
            for (j in stages) {
                if (i < j) {
                    user++
                    success++
                } else if (i == j) {
                    user++
                }
            }

            if (user == 0) {
                for (k in i..N) {
                    hashmap.put(k, 0.0)
                    println("i = $i user = $user success = $success fail = 0")
                }
                break


            } else {
                var fail = (user.toDouble() - success) / user
                hashmap.put(i, fail)
                println("i = $i user = $user success = $success fail = $fail")
            }


        }

        if (hashmap.size > 1) {
            hashmap = hashmap.toList().sortedByDescending { it.second }.toMap() as HashMap<Int, Double>
        }


//        // value 내림차순 정렬 후, value가 같다면 key값을 내림차순으로 정렬.
//        hashmap = hashmap.toList().sortedWith(compareByDescending<Pair<Int, Double>> { it.second }.thenByDescending { it.first}).toMap() as HashMap
//
//        // value 내림차순 정렬 후, value가 같다면 key값을 오름차순으로 정렬.
//        hashmap = hashmap.toList().sortedWith(compareByDescending<Pair<Int, Double>> { it.second }.thenBy { it.first}).toMap() as HashMap


        for (i in hashmap) {
            println("${i.key} dddd ${i.value}")
            answer.add(i.key)
        }

        println("--------")



        return answer.toIntArray()
    }
}

fun main() {
    var solution = Solution2()
    var N = 5
    var stages = intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)

    var answer = solution.solution(N, stages)

    answer.forEach { println(it) }

}