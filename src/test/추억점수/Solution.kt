package test.추억점수

class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {

        var total = 0
        var answer: IntArray = IntArray(photo.size)
        for (j in photo.indices){
            for(i in photo[j].indices){
                if(photo[j][i] in name){
                    total += yearning[name.indexOf(photo[j][i])]
                    println("이름 = ${photo[j][i]}" + " 점수 = ${yearning[name.indexOf(photo[j][i])]}")
                }
            }
            answer[j] = total
            println("j = $j answer[j] = ${answer[j]}")
            total = 0
        }



        return answer
    }
}

fun main() {
    var solution : Solution = Solution()
    var name : Array<String> = arrayOf("may", "kein", "kain", "radi")
    var yearning : IntArray = intArrayOf(5, 10, 1, 3)
    var photo : Array<Array<String>> = arrayOf(arrayOf("may", "kein", "kain", "radi"),arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni"))

    var score = solution.solution(name, yearning, photo);
    println(score)
}

