package com.minsub.scala.study

/**
  * Created by hmm1115222 on 2016-10-07.
  */
object TestClass {

  class Pizza(val size:Int = 12) {


    override def toString: String = { s"Pizza. size: $size" }
  }

  abstract class Person {
    def doing(): String
  }

  class Doctor extends Person {
    override def doing(): String = { "Heal!!" }
  }

  case class Animal(var name:String, var age:Int)

  def main(args: Array[String]): Unit = {
    println(new Pizza())
    println(new Pizza(14))

    println(new Doctor().doing())

    val dog = Animal("dog", 12)
    println(s"$dog" )
  }
}
