package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 21..
  */
object MethodTest {

  def main(args: Array[String]): Unit = {
    println(s"① ${add(1,2)}")
    println(s"② ${addWithoutReturn(1,2)}")
    println(s"③ ${addWithoutBlock(1,2)}")

    println("just: ", add(3,3))
  }

  // ① 일반적인 메소드
  def add(x:Int, y:Int): Int = {
    return x + y
  }

  // ② return을 생략한 메소드
  def addWithoutReturn(x:Int, y:Int) = { // x + y는 int이므로 return타입은 Int로 결정됩니다.
    x + y // return을 적어주지 않아도 마지막 값이 return값입니다.
  }

  // ③ 메소드가 한 줄일 경우 중괄호{}를 생략해도 됩니다.
  def addWithoutBlock(x:Int, y:Int) = x + y

}
