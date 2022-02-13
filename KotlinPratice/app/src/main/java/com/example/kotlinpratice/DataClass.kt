package com.example.kotlinpratice

//2.Data 클래스 출력하면 내용이 전부나옴
//일반 클래스로하면 값이 나옴

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
class Ticket2(val companyName : String, val name : String, var date : String, var seatNumber : Int)
//toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("koreanAir","joyce","2022-02-14",24)
    val ticketB = Ticket2("koreanAir","joyce","2022-02-14",24)

    println(ticketA)
    println(ticketB)
}