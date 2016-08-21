package com.minsub.scala.test

/**
  * Created by jiminsub on 2016. 8. 21..
  */
object ClassTest {
  class Complex(real:Double, imaginary:Double) {
    def re = real
    def im = imaginary
    override def toString: String = "re: "+re+", im:"+im
  }

  def main(args:Array[String]): Unit = {
    println("TEST")

    val com = new Complex(2.5, 3.5)
    println(s" re(): ${com.im}, im(): ${com.im}")
    println("toString: " + com)
  }

}
