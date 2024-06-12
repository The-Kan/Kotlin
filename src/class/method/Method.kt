package `class`.method


class Method(var x2 : Int, var y2 : Int) {

    fun drawCircle(x: Int, y: Int, radius: Int){

    }

    fun drawCircle2(x: Int, y: Int, radius: Int = 25){
        println("abc".withFoo())
    }


    // Unit 타입을 제외한 method에서는 단일 표현식(single expression) 표기가 가능하다.
    fun getNum() : Int = 21 * 2

    // 단일 표현식에서는 반환타입을 생략할 수 있다.
    //fun getNum2() = 21 * 2

    // 확장함수(extension function)
    private fun String.withPostfix(postFix : String) = "$postFix"
    fun String.withFoo() = this.withPostfix("yes")



    // 연산자 오버로딩(단항 연산자)
    operator fun unaryMinus() : Method{
        this.x2 = x2-2
        this.y2 = y2-2
        return this

    }

    // 동일성 비교 연산자(==)는 equals 함수를 재정의할 수 있다.
    // operrator가 아닌 ovveride를 사용해야함.
    override fun equals(other: Any?): Boolean {
        var a : Int = x2*x2
        var b : Int = y2*y2
        return a == b
    }

    // infix를 표기하여 중위 표기를 할 수 있다.
    infix fun increaseBy(amount: Int){
        this.x2 += amount
        this.y2 += amount
    }
}



fun main() {

    var method = Method(3, 5)

    method.drawCircle(3,5, 15)


    // 명명인자(named parameter)를 사용하여 의미를 정확히 알 수 있다. 또한, 순서를 바꿀 수 있다.
    method.drawCircle(x= 10, y =5, radius = 15)
    method.drawCircle(x= 10, radius = 15, y =5)


    // radius는 25로 고정되어 있다(default parameter - 기본 매개변수)
    method.drawCircle2(10, 5)


    // unaryMinus()를 연산자 오버로딩을 한다.
    var x3 = -method

    println(x3.x2) // print 1


    var x4 = -method
    println(x4.x2)

    // 이항 연산자 오버로딩
    var x5 = method + Method(10,10)

    println(x5.x2)

    // 중위 표기 함수 실행
    var x6  = method increaseBy 30
    x6 = method decreaseBy 30
}

// 확장 함수를 사용하여 연산자를 재정의함.
operator fun Method.unaryMinus() : Method{
    this.x2 = x2*2
    this.y2 = y2*2
    return this
}

// 이항 연산자 오버로딩
operator fun Method.plus(other : Method) : Method{
    this.x2 += other.x2
    this.y2 += other.y2

    return this
}

// 비교 연산자 오버로딩
operator fun Method.compareTo(other : Method) : Int{
    var a : Int = x2*x2
    var b : Int = y2*y2
    return a - b
}

// 인덱스 접근 연산자(index access operator) 오버로딩
operator fun Method.get(index: Int) = when(index){
    0 -> this.x2
    1 -> this.y2
    else -> IllegalArgumentException()
}

operator fun Method.set(index: Int, value: Int) {
    when(index){
        0 -> this.x2 = value
        1 -> this.y2 = value
        else -> IllegalArgumentException()
    }
}

//복합 할당 연산자(augmented assignment operator) 오버로딩
operator fun Method.plusAssign(other: Int){
    this.x2 += other
    this.y2 += other
}

operator fun Method.minusAssign(other: Int){
    this.x2 -= other
    this.y2 -= other
}

// in 연산자 오버로딩
operator fun Method.contains(other: Int) : Boolean{
    return this.x2 == other
}

// infix를 표기하여 중위 표기를 할 수 있다.
infix fun Method.decreaseBy(amount: Int){
    this.x2 -= amount
    this.y2 -= amount
}