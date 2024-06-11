package `class`.sealedclass

// sealed(한정) 클래스으로 when문에 사용하는 경우 else 를 처리하지 않아도 된다.
sealed class MobileApp(val os: String) {
    class Android(os: String, val packageName: String) : MobileApp(os)
    class Ios(os: String, val bundleID: String) : MobileApp(os)

}