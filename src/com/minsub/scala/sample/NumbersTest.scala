package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 21..
  */
object NumbersTest {

  def main(args: Array[String]): Unit = {
    val num = 5

    val numAbs = num.abs // 절대값
    val max5or7 = numAbs.max(7) // 5(numAbs)와 7 사이의 최대값
    val min5or7 = numAbs.min(7) // 5(numAbs)와 7 사이의 최소값
    println(numAbs) // 5
    println(max5or7) // 7
    println(min5or7) // 5

  }
}
