package com.minsub.scala.test

/**
  * Created by jiminsub on 2016. 8. 25..
  */
object GenericTest {

  class Reference[T] {
    private var contents: T = _
    def set(value: T) { contents = value}
    def get: T = contents
  }

  def main(args:Array[String]): Unit = {
    val ref = new Reference[Int]
    ref.set(13)
    println(s"reference Generic is ${ref.get}")
  }
}
