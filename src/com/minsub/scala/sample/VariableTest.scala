package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 25..
  */
object VariableTest {

  def main(args:Array[String]): Unit = {
    val s = "first string"
    // s = "second String"  // error

    var a = "first String"
    println(a)
    a = "second string"
    println(a)

    // val 로 선언한 변수는 immutable 상태이다
    // 변경을 원하는 변수는 var 로 선언해야 한다
  }

}
