package com.minsub.scala.sample.scalaclass

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object AbstractClassTest {

  abstract class Shape {
    def getArea(): Int
  }

  class Circle(r:Int) extends Shape {
    override def getArea(): Int = r * r * 3
  }

  def main(args:Array[String]) = {
    val circle = new Circle(3)
    println(s"Circle(3) area: ${circle.getArea()}")
  }
}
