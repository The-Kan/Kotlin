package test.무인도여행

class Solution {
    var checked = Array(100, { BooleanArray(100, {false}) })

    fun solution(maps: Array<String>): IntArray {
        var answer = ArrayList<Int>()


        maps.forEachIndexed { i, a ->
            a.forEachIndexed { j, c ->
                if(c.isDigit()){
                    var score = dfs(i,j, maps)
                    if(score != 0){
                        answer.add(score)
                    }
                    println("i $i j $j score $score")
                    // dfs 출발
                }
            }
        }

        if(answer.size == 0){
            answer.add(-1)
            return answer.toIntArray()
        }

        return answer.toIntArray().sortedArray()
    }

    private fun dfs(i: Int, j: Int, maps: Array<String>): Int {
        if(i !in maps.indices || j !in maps[0].indices) return 0
        if(!maps[i][j].isDigit()) return 0
        if(checked[i][j]) return 0

        checked[i][j] = true
        println("i $i j $j checked")
        var dirs = arrayOf(1 to 0, -1 to 0, 0 to -1, 0 to 1)
        var score = maps[i][j].digitToInt()
        for (dir in dirs){
            println("if ${i + dir.first} js ${j + dir.second}")
            score += dfs(i + dir.first, j + dir.second, maps)
        }

        return score
    }
}

fun main() {
    var solution = Solution()
    //var maps = arrayOf("X591X", "X1X5X", "X231X", "1XXX1")
    var maps = arrayOf("XXX", "XXX", "XXX", "XXX")
    var answer = solution.solution(maps)
    answer.forEach {
        println(it)
    }
}