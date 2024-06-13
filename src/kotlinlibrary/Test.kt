package kotlinlibrary

import java.util.Objects

class Test {

    fun showMessage(isPrepared : Boolean, msg: String, any: Objects?) {

        // isPrepared가 false이면, IllegalStateException 발생
        check(isPrepared)

        // msg.length > 10가 false이면, IllegalArgumentException 발생
        require(msg.length > 10)

        // any가 null이면, IllegalArgumentException 발생, showError 실행
        requireNotNull(any, showError)
    }

    // 함수 타입
    var showError : () -> Unit = {
        println("Error")
    }

    fun doError(isPrepared: Boolean){
        if(!isPrepared){
            // IllegalStateException: Error Occur
            error("Error Occur")
        }
    }

    fun stop() {
        // 구현되지 않은 함수를 호출할 때 kotlin.NotImplementedError를 발생시킴으로써 프로그램을 종료시킬 수 있다.
        TODO("Brake is not implemented")
    }

}


fun main() {

    var test = Test()
    //test.showMessage(true, "12345678910", null)
    test.doError(false)

    // 함수타입 호출
    test.showError()
    test.stop()
}