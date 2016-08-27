package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object ApplyTest {

  class Foo {}
  object FooMaker {
    def apply() = new Foo
  }


  class Bar {
    def apply() = 0
  }

  def main(args:Array[String]) = {

    val foo = FooMaker()
    println(s" create Foo by FooMaker(): " + foo)

    val bar = new Bar
    println(s" just bar() : " + bar())
  }
}
