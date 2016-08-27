package com.minsub.scala.sample.scalaclass

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object ObjectTest {

  // 1. Ojbect는 유일한 인스턴스를 넣기 위해 사용한다 보통 팩토리에 사용된다
  object Timer {
    var count = 0
    def currentCount(): Long = {
      count += 1
      count
    }
  }

  // 2. new를 사용하지 않고 객체 생성
  class Bar(foo: String)
  object Bar {
    def apply(foo:String) = new Bar(foo)
  }

  // 3. 모든 함수는 객체다.함수는 trait의 집합이다. apply가 정의된것과 같다
  object addOne extends Function1[Int, Int] {
    override def apply(v: Int): Int = v + 1
  }
  // Function은 22까지 정의 되어있고 (Int => Int)로 대체 가능하다
  object addOne2 extends (Int => Int) {
    def apply(v: Int): Int = v + 1
  }

  def main(args:Array[String]) = {
    // 1
    println(s"current Count: ${Timer.currentCount()}")
    println(s"current Count: ${Timer.currentCount()}")

    // 2
    val bar1 = Bar("a")
    val bar2 = Bar("b")
    println(s"create object without new: ${bar1.getClass}")
    println(s"create object without new: ${bar2}")

    // 3
    println(s"call addone(1): ${addOne(1)}")
    println(s"call addone2(2): ${addOne2(2)}")
  }
}
