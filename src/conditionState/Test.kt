package conditionState

import java.io.IOException

class Test {
}

fun main() {
    var age: Int = 25
    var ageRange : String
    if(age >= 10 && age < 20){
        ageRange = "10대"
    } else if(age >= 20 && age < 30){
        ageRange = "20대"
    } else {
        ageRange = "기타"
    }

    println(ageRange)

    // if문이 값을 return 할 수 있다.
    age = 35
    ageRange = if(age >= 10 && age < 20){
        "10대"
    } else if(age >= 20 && age < 30){
        "20대"
    } else {
       "기타"
    }

    println(ageRange)

    val bags : Int = 1

    when(bags) {
        0 -> println("0")
        1 -> println("1")
        2 -> println("2")
        // 자바 switch문의 default 구문을 대신함.
        else -> println("else")
    }

    var result : String

    // when문이 값을 return 할 수 있다.
    result = when(bags) {
        0 -> "0"
        1 -> "1"
        2 -> "2"
        // 자바 switch문의 default 구문을 대신함.
        else -> "else"
    }
    println(result)


    val e : Exception? = null
    // when문을 표현식으로 작성하는 예시
    when(e){
        is IOException -> println("IOException")
        is IllegalStateException -> println("IllegalStateException")
        else -> println("Exception")
    }

    var a : Int = 0
    var b: Int = 10
    while(a<b){
        a+=2
        b++
    }
    println("b = $b")

    a = 0
    b = 10
    do {
        a+=2
        b++
    } while(a<b)
    println("b = $b")


    // 코틀린은 for-each문만 제공된다.
    val names : List<String> = arrayListOf("a", "b", "c")
    for(name in names){
        println(name)
    }

    // 인덱스로 for문 돌리기
    for(i in names.indices){
        println("i = $i name = ${names[i]}") //${names.get(i)}
    }


    // 범위
    var intRange = 1..3
    for(i in intRange){
        println(i)
    }

    for(i in 1..10 step 2){
        println(i)
    }

    for(i in 1 until  10){
        println(i)
    }

    // in 연산자
    var intRangeBoolean : Boolean = 2 in intRange
    println(intRangeBoolean)

    var notIn : Boolean = 2 !in intRange
    println(notIn)

    // downTo

    for(i in 5 downTo 1 step 2){
        println(i)
    }
}
