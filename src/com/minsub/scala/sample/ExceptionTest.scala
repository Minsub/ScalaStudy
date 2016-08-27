package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object ExceptionTest {





  def main(args: Array[String]) {

    try {
      println(s"parse int: ${"123a".toInt}")
    } catch {
      case e: Throwable => println(e)
    } finally {
      println("Finally")
    }


  }

}
