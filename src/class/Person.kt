package `class`

// open - Person2에게 상속을 위함
open class Person {

    // name is possible null
    var name : String? = null

    // 선언 시점에 값을 할당하지 않아도 컴파일 에러가 발생하지 않는다.
    // lateinit 선언 시점에 값을 할당하지 않고 나중에 할당하는 경우 사용한다.
    lateinit var address : String

    open var num : Int = 3

    open fun sum() : Int {
        return 0
    }
}