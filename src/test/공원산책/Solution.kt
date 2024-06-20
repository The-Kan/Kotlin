package test.공원산책

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {


        var dirMap = mapOf('E' to Pair(1, 0), 'S' to Pair(0, 1), 'N' to Pair(0, -1), 'W' to Pair(-1, 0))

        var nowX = -1
        var nowY = -1

        // start 지정완료
        for(i in 0..park.lastIndex){
            for(j in 0..park[i].lastIndex){
                if(park[i][j] == 'S'){
                    nowX = j
                    nowY = i
                }
            }
        }

        for(i in routes){
            var tempX = nowX
            var tempY = nowY
            var move = true

            for(j in 1..i[2].digitToInt()){
                println("j =$j")
                tempX += dirMap[i[0]]!!.first
                tempY += dirMap[i[0]]!!.second
                println("tempX $tempX tempY $tempY")
                if(tempX >= park[0].length || tempY >= park.size || tempX < 0 || tempY < 0){
                    println("move false 1")
                    move = false
                    break
                }

                if(park[tempY][tempX] == 'X'){
                    println("move false 2")
                    move = false
                    break
                }
            }

            if(move){
                nowX = tempX
                nowY = tempY
            }

            println("nowX = $nowX nowY = $nowY")
        }


        var answer: IntArray = intArrayOf(nowY, nowX)
        return answer
    }
}

fun main() {
    var solution = Solution()
    var park = arrayOf("SOO","OXX","OOO")
    var routes = arrayOf("E 2","S 2","W 1")

    var answer = solution.solution(park, routes)
    for (i in answer){
        print("$i ")
    }
    println()
}