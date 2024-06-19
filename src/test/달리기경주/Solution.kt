package test.달리기경주

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer = ArrayList<String>()
        var hashMapNameScore = HashMap<String, Int>()
        var hashMapScoreName = HashMap<Int, String>()

        for(i in 0..players.lastIndex){
            hashMapNameScore.put(players[i], i+1)
            hashMapScoreName.put(i+1, players[i])
        }

        for (name in callings){
            var score = hashMapNameScore.get(name)
            var firstName = hashMapScoreName.get(score!!-1)

            hashMapNameScore.put(name, score!!-1)
            hashMapScoreName.put(score!!-1, name)

            hashMapNameScore.put(firstName!!, score!!)
            hashMapScoreName.put(score!!, firstName!!)

            for (a in hashMapNameScore){
                println("${a.key} ${a.value}")
            }

            for (a in hashMapScoreName){
                println("${a.key} ${a.value}")
            }

            println("-----------")
        }

        for (a in hashMapScoreName){
            answer.add(a.value)
        }

        return answer.toTypedArray()
    }
}

fun main() {

    var solution = Solution()
    var players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    var callings = arrayOf("kai", "kai", "mine", "mine")
    var answer = solution.solution(players, callings)

    println("answer")
    for (i in answer){
        println(i)
    }
}