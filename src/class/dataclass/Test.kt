package `class`.dataclass

import `class`.sealedclass.who

class Test {
}

fun main() {

    val john = Person("John Doe", "SomeWhere")
    val john2 = Person("John Doe", "SomeWhere")

    println(john == john2)
    println(john.toString())


}