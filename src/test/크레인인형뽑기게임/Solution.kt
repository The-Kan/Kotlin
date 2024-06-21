package test.크레인인형뽑기게임

import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0

        var spot = Stack<Int>()

        moves.forEach {
            println("it = $it")
            var peek = false
            var num = -1
            for (i in 0..board.lastIndex){
                println("board[i][it-1] = ${board[i][it-1]}")
                if(board[i][it-1] != 0){
                    peek = true
                    num = board[i][it-1]
                    board[i][it-1] = 0
                    break
                }
            }

            if(peek){
                if(spot.isEmpty()){
                    spot.add(num)
                } else{
                    var num2 = spot.peek()
                    if(num == num2){
                        answer+=2
                        spot.pop()
                    } else {
                        spot.add(num)
                    }

                }
            }


        }




        return answer
    }
}

fun main() {
    var solution = Solution()
    var board = arrayOf(intArrayOf(0,0,0,0,0), intArrayOf(0,0,1,0,3), intArrayOf(0,2,5,0,1), intArrayOf(4,2,4,4,2), intArrayOf(3,5,1,3,1))
    var moves = intArrayOf(1,5,3,5,1,2,1,4)
    println(solution.solution(board,moves ))
}