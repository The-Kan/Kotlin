package delegate

import kotlin.reflect.KProperty

class Test {
}

fun main() {

    var p by Delegate()


    println(p)
}



class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Char {
        return 'a'
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Char) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}