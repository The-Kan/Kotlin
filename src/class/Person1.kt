package `class`

// 정적 필드, 정적 메소드를 선언.
const val FOO = 123
fun foo() {

}

// 클래스 이름 뒤에 초기화 인자를 받는다.
class Person1(a: Int, b: Int) {

    // a의 값만 인자로 받는 추가 생성자.
   constructor(a: Int) : this(a, 0)

    // Int를 반환하는 함수
    fun sum() : Int{
        return 0
    }

    // 반환값이 없는 메소드를 선언하는 경우 Unit
   fun sum2() : Unit {

   }

   // 반환값이 없으면 Unit를 생략할 수 있음.
    fun sum3() {

    }

}