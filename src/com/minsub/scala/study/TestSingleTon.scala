package com.minsub.scala.study

import scala.collection.mutable
/**
  * Created by hmm1115222 on 2016-10-07.
  */
object TestSingleTon {
  private val cache = mutable.Map[Int, Int]()
  def calc(s: Int): Int = {
    if (cache.contains(s)) {
      println("Cache!")
      cache(s)
    } else {
      val result = s * s
      cache += (s -> result)
      result
    }
  }

  def main(args: Array[String]): Unit = {
    println("TEST")
    println(TestSingleTon.calc(2))
    println(TestSingleTon.calc(2))
    println(TestSingleTon.calc(2))
  }
}