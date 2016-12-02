package com.minsub.scala.study2

/**
  * Created by hmm1115222 on 2016-12-02.
  */
object CallByValyeAndName {

  def doSomething(): Int = {
    println("<doSomething>")
    1
  }

  def callByValue(x: Int) = {
    println(s"callByValue: $x")
    println(s"callByValue: $x")
  }

  def callByName(x: => Int) = {
    println(s"callByName: $x")
    println(s"callByName: $x")
  }

  def main(args: Array[String]): Unit = {
    callByValue(doSomething())

    println()
    println()

    callByName(doSomething())

  }
}
