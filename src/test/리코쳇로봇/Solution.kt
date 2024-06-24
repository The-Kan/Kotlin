package test.리코쳇로봇

import java.util.*

class Solution {
    fun solution(board: Array<String>): Int {
        var answer: Int = -1
        var dir = arrayOf(arrayOf(0, 1), arrayOf(1, 0), arrayOf(-1, 0), arrayOf(0, -1))


        var maxY = board.size
        var maxX = board[0].length

        var a = IntArray(3, {0})

        var already = Array(maxY, {BooleanArray(maxX, {false})})

        var startX = 0
        var startY = 0
        var endX = 0
        var endY = 0
        board.forEachIndexed { i, s ->
            s.forEachIndexed { j, c ->
                if(c=='R'){
                    startX = j
                    startY = i
                } else if(c == 'G'){
                    endX = j
                    endY = i
                }
            }
        }

        val queue: Queue<Point> = LinkedList()
        queue.add(Point(startX, startY, 0))



        while(!queue.isEmpty()){

            var a = queue.poll()
            var x = a.x
            var y = a.y

            if(already[y][x]){
                println("startY $startY startX $startX alredy")

                continue
            }

            already[y][x] = true

            if(board[y][x] == 'G'){
                answer = a.cnt
                break
            }

            for(i in dir){
                var tempX = x
                var tempY = y


                while(true){
                    tempX+=i[0]
                    tempY+=i[1]
                    if(tempX < maxX && tempY < maxY && tempX >= 0 && tempY >= 0){
                        if(board[tempY][tempX] == 'D'){
                            println("장애물")
                            tempX-=i[0]
                            tempY-=i[1]
                            break
                        }
                    } else {
                        println("벽")
                        tempX-=i[0]
                        tempY-=i[1]
                        break
                    }
                }

                queue.add(Point(tempX, tempY, a.cnt+1))
                println("tempX $tempX tempY $tempY cnt ${a.cnt+1}")
            }
        }

        return answer
    }
}

class Point(var x: Int, var y: Int, var cnt: Int) {
}

fun main() {

    var solution = Solution()
    //var board = arrayOf("...D..R", ".D.G...", "....D.D", "D....D.", "..D....")
    var board = arrayOf(".D.R", "....", ".G..", "...D")

    println(solution.solution(board))

}