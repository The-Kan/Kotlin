package `null`

class NullChecker {

    // lateinit 나중에 초기화 하고자 하는 목적. Primitive Type (Int, Float, Double, Long 등)에는 못씀
    lateinit var num : NullChecker
}

fun main() {

    var num1 : Int? = 4

    // 엘비스 연산자 ?:
    // num1이 null이 아닌 경우 num1 대입
    // num1이 null인 경우 3 대입
    var num2 = num1 ?: 3

    // *안전한 호출 연산자 ?.
    // num1이 null이 아닌 경우 plus 호출
    // num1이 null인 경우 null 반환
    var num3 : Int? = num1?.plus(5)


    // bar가 널 값을 허용하도록 Int?로 정의
    // 자료형 변환에 실패하므로 bar에는 널 값이 할당됨.
    // 자료형 변환에 실패하여 null을 할당받지 않고 3을 할당 받도록 한다. ?: 엘비스 연산자 활용
    val foo : String = "foo"
    val bar : Int? = foo as? Int ?: 3


    // 비 널 값 보증 (!!)은 한 라인에서 두개이상 쓰지 않는다.
    // null 값이 발생한 경우 NullPointerException이 발생하는데, 어느 부분에서 발생했는지 알 수 없기 때문이다.
    val num4 : Int = num1!!.plus(3)!!.plus(5)


}