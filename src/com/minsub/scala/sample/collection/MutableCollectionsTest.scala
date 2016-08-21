package com.minsub.scala.sample.collection

import scala.collection.mutable

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object MutableCollectionsTest {
  def main(args: Array[String]): Unit = {
    // ① 배열로 구현되는 ArrayBuffer
    val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
    arrayBuffer += 4
    arrayBuffer -= 1
    arrayBuffer ++= List(5, 6, 7)
    println(s"① $arrayBuffer")

    // ② Linked list로 구현되는 ListBuffer
    val listBuffer = mutable.ListBuffer("a", "b", "c")
    println(s"② $listBuffer")

    // ③ Mutable Set
    val hashSet = mutable.Set(0.1, 0.2, 0.3)
    hashSet ++= mutable.Set(5)
    println(s"③ $hashSet")

    // ④ Mutable Map
    val hashMap = mutable.Map("one" -> 1, "two" -> 2)
    hashMap ++= Map("five" -> 5, "six" -> 6)
    println(s"④ $hashMap")


    // ① 변경할 수 없는 Collection이 var로 선언된 경우
    var immutableSet = Set(1, 2, 3)
    immutableSet += 4
    // 위의 코드는 새로운 Set을 만들어서 immutableSet에 저장하는 아래 코드와 같음
    immutableSet = immutableSet + 4
    println(s"① $immutableSet")

    // ② 변경할 수 있는 Collection이라면 추가하는 Method를 호출하는것과 같음
    val mutableSet = mutable.Set(1, 2, 3)
    mutableSet += 4
    // 위의 코드는 mutableSet 자체의 메소드(+=이라는 메소드)를 호출하는 아래 코드와 같음
    mutableSet.+=(4)
    println(s"② $mutableSet")
  }
}
