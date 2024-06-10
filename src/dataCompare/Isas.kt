package dataCompare

class Isas {
}

fun main() {

    var a = 65

    if(a is Int){
        println("A is Int")
    }


    var b : Number = 600

    var c = b as Int
    println(c)
}