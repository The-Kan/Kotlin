package `class`.sealedclass

class Test {


}

fun who(app: MobileApp) = when(app) {
    is MobileApp.Android -> println("${app.packageName} and ${app.os}")
    is MobileApp.Ios -> println("${app.os} and ${app.bundleID}")
}

fun main() {



}