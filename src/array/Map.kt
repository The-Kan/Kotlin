package array

fun main(){
    val immutableMap : Map<String, Int> = mapOf(Pair("A", 65), Pair("B", 66))

    val code : Int? = immutableMap["A"]

    // Compile Error - immutable! ->  /listOf(), List/ /setOf(), Set/ /mapOf(), Map/
    //immutableMap["C"] = 67

    println(code)

    val mutableMap : HashMap<String, Int> = hashMapOf(Pair("A", 65), Pair("B", 66))

    // HashMap is mutable!
    mutableMap["C"] = 67

    println(mutableMap["C"])

    // "A" to 65 is instead of Pair("A", 65)
    val mutableMap2 : HashMap<String, Int> = hashMapOf("A" to 65, "B" to 66)

    println(mutableMap2["B"])
}