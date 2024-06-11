package test.바탕화면정리

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {

        var lux : Int = 50
        var luy : Int = 50

        var rdx : Int = -1
        var rdy : Int = -1

        for (i in wallpaper.indices){
            var charArray = wallpaper[i].toCharArray()

            for(j in charArray.indices){
                if(charArray[j] == '#'){
                    if(lux > i) lux = i;
                    if(luy > j) luy = j;
                    if(rdx < i) rdx = i;
                    if(rdy < j) rdy = j;
                }
            }
        }

        rdx++
        rdy++
        var answer: IntArray = intArrayOf(lux, luy, rdx, rdy)
        return answer
    }
}

fun main() {
    var solution : Solution = Solution()


    var strings : Array<String> = arrayOf("..", "#.")
    var answer = solution.solution(strings)

    for(i in answer){
        print("$i ")
    }
}