package com.minsub.scala.sample.scalaclass

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object CaseClassTest {

  /* 1. Case Class는 new 없이 생성가능하고 인자로 받는 값이 자동으로 변수로 지정된다
   *    toString이 이쁘게 나오고, equal도 valuable 기반으로 동작한다.
   */
  case class Calc(brand:String, model:String) {
  }


  // 2. Case class는 match로 value를 넣은 채로 비교가 가능하다.
  def calcType(c:Calc) = c match {
    case Calc("HP","20B") => "financial"
    case Calc("HP","40B") => "scientific"
    case Calc(_,_) => "Just Calc class"
    case _ => "Error"
  }

  def main(args: Array[String]) {
    // 1
    val c1 = Calc("HP", "20B")
    val c2 = Calc("HP", "20B")
    println(s"c1: ${c1}, c2: ${c2}")
    println(s"equal: ${c1 == c2}")

    // 2
    println(s"calcType(c1): ${calcType(c1)}")
    println(s"calcType(Calc('a','b'): ${calcType(Calc("A","B"))}")


  }

}
