package `class`

class Person3 private constructor(val name : String) {

    // 코틀린은 클래스 내에 정적필드, 정적메소드를 둘수 없다.
    // 대신, 인스턴스 생성 없이 사용할 수 있는 오브젝트를 정의할 수 있는데, 이를 companion object 라고한다.
    companion object{
        fun create(name : String) : Person3{
            return Person3("Deok")
        }
    }
}