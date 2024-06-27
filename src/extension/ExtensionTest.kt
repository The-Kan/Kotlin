package extension



class ExtensionTest {
    var num = 0
    fun printNum() {
        println(num)
    }
}


class ExtenSionTest2 {
    fun ExtensionTest.print(){
        println("print 확장2")
    }

    fun print() {
        var extensionTest = ExtensionTest()
        extensionTest.print()
    }
}

// 1. 함수 인자가 없으며 반환타입이 Unit인 확장함수를 정의.
fun ExtensionTest.print(){
    printNum()
    println("print 확장1")
}

fun main() {

    var extensionTest = ExtensionTest()
    extensionTest.print()

    var extenSionTest2 = ExtenSionTest2()
    extenSionTest2.print()

    // 2. ExtensionTest에 함수 인자가 없고, 반환타입이 없는 확장 함수를 func 함수 변수에 대입.
    var func : ExtensionTest.() -> Unit = {
        // ExtensionTest 프로퍼티를 사용할 수 있는 {} 스코프
        print()
    }

    // 3. ExtensionTest.() -> Unit 함수 타입 변수 func를 대입
    function(func)

    // 4. {} 스코프내에 익명함수를 생성
    function {
        print("scope")
    }
}

fun function(content : ExtensionTest.() -> Unit){
    println("function")
    var extensionTest = ExtensionTest().apply(content)
}


