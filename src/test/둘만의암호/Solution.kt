package test.둘만의암호

class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""

        for (i in s){
            var idx1 = 1
            var count = 1
            var char2 = 'a'
            while(true){
                var idx = i.code + (idx1 % 26)
                println("idx = " + idx)
                if(idx > 122) idx = idx - 26

                char2 = (idx).toChar()

                if(skip.contains(char2)) {
                    idx1++
                    continue
                }
                else {
                    if(count >= index){
                        break
                    }
                    count++
                    idx1++
                }
            }

            answer = answer + char2
            println(char2)
        }

        return answer
    }
}


fun main() {
    var solution = Solution()
    var s = "klmnopqrstuvwxyz"
    var skip = "abcdefghij"
    var index = 20

    println(solution.solution(s, skip, index))
}