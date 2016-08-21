package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object AnonymousFunctionTest2 {
  def main(args: Array[String]): Unit = {
    // 모두 두 숫자를 더해주는 역할을 하므로 같은 결과를 출력
    println(s"① ${add1(42,13)}")
    println(s"② ${add2(42,13)}")
    println(s"③ ${add3(42,13)}")
    println(s"④ ${add4(42,13)}")
  }
  // ① 메소드를 정의하는 방식
  def add1(x:Int, y:Int) = x + y

  // ② 익명함수
  val add2 = (x:Int, y:Int) => x + y

  // ③ 익명함수를 정의하는 다른 방식
  val add3:(Int,Int)=>Int = _ + _

  // ④ 익명함수를 정의하는 또다른 방식(잘 사용 안함)
  val add4 = (_ + _):(Int,Int)=>Int

}
