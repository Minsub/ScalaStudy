package com.minsub.scala.study

import scala.collection.mutable.ArrayBuffer

/**
  * Created by hmm1115222 on 2016-10-05.
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    // ##apply
    // Array에서 index로 접근하는 방법은 arr(n)으로한다. 기본적으로 변서 arr에 ()를 뒤에 붙히면 arr.apply(n) 이 호출되는 구조다.

    // Array 만들기
    val arr1 = new Array[String](2)
    arr1(0) = "Hello"
    arr1(1) = "World"

    val arr2 = Array("Hello", "World")

    // List 만들기
    val list1 = List(1,2,3)
    val list2 = List.range(1, 10)
    val list3 = List.fill(3)("Foo")
    val list4 = list1 ::: list2  // List 합치기 (:::) (++)
    val list5 = 0 :: list1 // 앞에 집어넣기 (::) 뒤에 붙히기는 :+

    // List 주요 Method
    val listDrop = list1.drop(2) // drop: n번쨰까지 없애
    val c = list1.count( n => n < 3) // count: function( K => boolean)을 받아서 해당하는 갯수 가져오기
    val listMap = list1.map(n => n * 10) // map: 각 List의 원소를 컨트롤 해서 다시 List를 만듬

    // ArrayBuffer
    val ab1 = new ArrayBuffer[String]
    ab1 += "ABC"
    ab1 += "DEW"

    println(s"arrayBuffer: $ab1")
  }
}
