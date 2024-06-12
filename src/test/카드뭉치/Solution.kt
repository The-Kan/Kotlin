package test.카드뭉치

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"

        var card1Index = 0
        var card2Index = 0

        for (word in goal){

            if(card1Index < cards1.size && word == cards1[card1Index]){
                card1Index++
            } else if(card2Index < cards2.size && word == cards2[card2Index]){
                card2Index++
            } else{
                answer ="No"
                break
            }
        }

        return answer
    }
}

fun main() {

    var solution = Solution()

    var cards1 = arrayOf("i", "water", "drink")
    var cards2 = arrayOf("want", "to")
    var goal = arrayOf("i", "want", "to", "drink", "water")


    println(solution.solution(cards1, cards2, goal))
}