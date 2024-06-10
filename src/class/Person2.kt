package `class`



// : 클래스() 클래스를 상속함.
class Person2 : Person() {

    override var num = 3;

    override fun sum() : Int{

        // Person1 클래스 외부의 정적 필드를 호출
        var num = FOO

        // Person1 클래스 외부의 정적 메소드를 호출
        foo()

        // Person3의 Companion object를 통해 create 를 호출한다.
        Person3.create("Deok2")
        return 1
    }
}