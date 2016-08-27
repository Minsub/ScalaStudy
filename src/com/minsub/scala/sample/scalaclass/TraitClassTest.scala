package com.minsub.scala.sample.scalaclass

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object TraitClassTest {

  trait Car {
    val brand: String
  }

  trait Shiny {
    val shine: Int
  }

  class BMW extends Car with Shiny {
    override val brand: String = "BMW"
    override val shine: Int = 12
  }

  trait Cache[K, V] {
    def get(key:K): V
    def put(key:K, value:V)
    def delete(key: K)
  }

  def main(args:Array[String]) = {
    println("@@@ˇ")
  }
}
