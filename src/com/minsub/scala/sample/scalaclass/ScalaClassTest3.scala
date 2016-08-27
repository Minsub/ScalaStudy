package com.minsub.scala.sample.scalaclass

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object ScalaClassTest3 {

  class Calculator(brand:String) {
    /**
      * 생성자 부분
      */
    val color: String = if (brand == "HP") {
      "blue"
    } else {
      "black"
    }

    var acc = 0
    val func = { () => acc += 1}
    def minc = acc += 1

  }

  def main(args: Array[String]): Unit = {
    val c = new Calculator("HP")
    println("c.color: " + c.color)

    println(c.func)
    println(c.acc)
    println(c.minc)
    println(c.acc)
  }
}
