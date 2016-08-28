package com.minsub.scala.sample.collection

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object CollectionTest {

  def main(args: Array[String]) {
    // 1. List
    val list1 = List(1,2,3,4,5)
    println(s"List: ${list1} class: ${list1.getClass}")

    // 2. Set
    val set1 = Set(1,1,1,2,3,3)
    println(s"Set: ${set1} class: ${set1.getClass}")

    // 3.Tuple: ._1, ._2 순서대로 접근 가능
    val t1 = ("localhost", 80, true)
    println(s"Tuple: ${t1}, t1._1: ${t1._1} class: ${t1.getClass}")
    // -> 로도 만들수 있다 근데 2쌍뿐이 안됨
    var t2 = 1 -> 2 -> 3
    println(s"Tuple: ${t2}, t1._1: ${t2._1} class: ${t2.getClass}")

    // 4. Map: 실제로는 1 -> "one"이 tuple을 만드는 문법이다 즉 Tuple1으로 들어간다고 보면 된다. 그리고 가변인자 구조로 여러개가 들어간다.
    var map1 = Map(1 -> "one", 2->"two")
    println(s"Map: ${map1} class: ${map1.getClass}")

    // 5. Option: Map은 option을 반환한다 값이 있을수도 없을수도 있다는 의미다.
    val optVal = map1.get(1)
    println(s"option of map: isDefined: ${optVal.isDefined} getOrEles: ${optVal.getOrElse("empty")}")
    // Some, None등은 Option 관련 클래스다
    val o = optVal match {
      case Some(n) => n + n
      case None => "None"
    }
    println(s"o: ${o}")

    // 6. Seq
    val seq = Seq(1,2,3,4,1,2,3,4)
    println(s"Seq: ${seq}")

  }
}
