package com.example.kotlinpratice
//8. 클래스 init로 주생성자 먼저생성되고 추가 가능 constructor로 부생성자 추가 가능

open class Human constructor(val name:String = "Annonymous") {

    constructor(name : String ,age : Int) : this(name) {
        println("My name is ${name},${age}years old")

    }

    init{
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("this is so Yummy~")
    }
    open fun singAsong(){
        println("lalala")
    }
}


//상속 위에 클래스를 open해야지 가져올 수 있음 위에 껏도 가져오고싶으면 super
class Korean : Human(){
    override fun singAsong(){
        super.singAsong()
        println("라라라")
        println("my name is ${name}")

    }


}
fun main(){
    val human = Human(name = "minsu")

    val stranger = Human()
    human.eatingCake()

    val mom = Human("KURI",52)

    println("this human's name is ${stranger.name}")
    val korean = Korean()
    korean.singAsong()



}


