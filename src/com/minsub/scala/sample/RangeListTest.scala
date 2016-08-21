package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 21..
  */
object RangeListTest {

  def main(args: Array[String]): Unit = {
    val range1 = 1 to 10
    println("1 to 10: ", range1)

    val range2 = 1 until 10
    println("1 until 10: " , range2)

    val range3 = 1 until 10 by 3
    println("1 until 10 by 3: ", range3)

    val list1 = range1.toList
    println("range1.toLst: ", list1)

    val filter1 = range1.filter(_ > 4)
    println("range1.filter(_ > 4): ", filter1)

    val doubleInt = range1.map(_ * 2)
    println("range1.map(_ * 2): ", doubleInt)

  }
}
