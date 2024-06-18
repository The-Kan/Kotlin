package array

class Sort {

    fun sort(){
        var hashMap = hashMapOf(1 to 0.3, 2 to 0.1, 3 to 0.5, 4 to 0.3)


        hashMap = hashMap.toList().sortedWith(compareByDescending<Pair<Int, Double>> { it.second }.thenByDescending { it.first }).toMap() as HashMap

        println("value 내림차순 정렬, value 같다면 key 내림차순 정렬")
        for(i in hashMap){
            println("key = ${i.key}, value = ${i.value}")
        }

        hashMap = hashMap.toList().sortedWith(compareByDescending<Pair<Int, Double>> { it.second }.thenBy { it.first }).toMap() as HashMap
        println("value 내림차순 정렬, value 같다면 key 오름차순 정렬")
        for(i in hashMap){
            println("key = ${i.key}, value = ${i.value}")
        }
    }

}

fun main() {
    var sort = Sort()
    sort.sort()
}