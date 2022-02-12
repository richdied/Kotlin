package com.example.kotlinpratice

fun main(){
    //3 String. Template 변수를 표시하고 싶을때 $표시 사용 뛰어쓰기하고싶지않을때는{}사용
    val name = "Joyce"
    val lastname = "hong"
    println("My Name is ${name+lastname}I'm 23")

    println("this is 2\$a")

    helloWorld()

    println(add(4,5) )

    checkNum(1)

    forAndWhile()

    nullcheck()



}

//1. 함수 변수명을 타입보다 먼저써준다. 리턴타입은 파라미터뒤에 지정

fun helloWorld() {
    println("Hello World!")
}
fun add(a : Int, b: Int) : Int{
    return a+b
}
//2.val vs var val 상수값, var 변화하는 값
//val = value

fun hi(){
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100
    println(b)

    val c = 100
    var d = 100

    var name = "Joyce"
}

//4. 조건식 생략으로 fun maxBy2(a:Int,b:Int) = if(a>b) a else b 으로도 사용가능
// when 조건식도 사용가능

fun maxBy(a: Int, b: Int) : Int {
    if(a > b) {
        return a
    }else{
        return b
    }
}

fun maxBy2(a:Int,b:Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score){
        0 -> print("this is 0")
        1 -> print("this is 1")
        2,3 -> print("this is 2 or 3")
        else ->  print("IDK")
    }
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
    print("b: ${b} ")
    when(score){
        in 90..100 -> println("YOU ARE GENIUS")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}
// Expression vs Statement 모든 함수는 expression 리턴값 반환,  statement 명령

//5. Array and List
// Array 변경가능

// List 1. list 2. mutableList list는 변경불가능 인터페이스라 mutablelList는 변경가능

fun array(){
    val array = arrayOf(1,2,3,)
    val list = listOf(1,2,3,)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",3.4f)

    array[0] = 3
    val result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

//6.반복문 for / while
fun forAndWhile(){
    val students = arrayListOf("j","y","z","d")
    for (name in students){
        println("${name}")
    }

    for((index,name)in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }
    var sum : Int = 0
    for( i in 1..10 step 2){
        sum += i

    }
    var sum2 : Int = 0
    for( i in 10 downTo 1){
        sum += i
    }
    var sum3 : Int = 0
    for( i in 1 until 100){ // 100을 포함하지 않음 99까지
        sum += i
    }
    println(sum)
    println(sum2)
    println(sum3)

    var index = 0
    while(index <10){
        println("current index : ${index}")
        index++
    }

}

//7. Nullable / NonNull ?넣으면 null이 됨 : string을 생락하면 nonnull타입
fun nullcheck(){
    //NPE null pointer Exception

    var name  = "Joyce"

    var nullName : String? = null

    var nameInUpperCase : String = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?:(엘비스 연산자) null값이없고 lastname이 없으면 no lastname을 출력

    val lastName : String? = "Hong" //or null

    val fullName = name+" " +(lastName?:"No lastName")

    println(fullName)


}
    //!! 컴퍼일러한테 확실하게 내가 눌이 아니니깐 실행하라고 지시 엘비스를 많이쓰는게 더 좋긴함
fun ignoreNulls(str : String?) {
        val mNotNull: String = str!!
        val upper = mNotNull.toUpperCase()

    // let 눌이 아니라면 이내부로 옮겨줌
        val email: String? = "joyhongxx@naver.cox"
        email?.let {
            println("my email is ${email}")

        }
    }