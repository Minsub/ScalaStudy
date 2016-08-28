package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 28..
  */
object CallByTest {
  case class R(var a:String) {}

  def f1(x: R) = x.a = "after value (x: R)"
  def f2(x: => R) = x.a ="after Value (x:=>R)"


  def main(args: Array[String]) {
    var v = R("before")
    println(v)
    f1(v)
    println(v)
    f2(v)
    println(v)

  }



}
