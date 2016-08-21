package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 21..
  */
object StringTest {

  def main(args: Array[String]): Unit = {
    val reverse1 = "scala".reverse
    println("str.reverse: ", reverse1)

    val cap = "scala".capitalize
    println(s"② $cap")

    // ③ 7번 반복
    val multi = "Scala! " * 7
    println(s"③ $multi")

    // ④ 정수로 변환
    val int = "123".toInt
    println(s"④ $int")
    
  }
}
