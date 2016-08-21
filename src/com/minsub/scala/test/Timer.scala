package com.minsub.scala.test

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object Timer {
  def oncePerSecond(callback: ()=> Unit) = {
    while(true) {
      callback()
      Thread.sleep(1000)
    }
  }

  def timeFlies(): Unit = {
    println("Time files like an arrow...")
  }



  def main(args: Array[String]): Unit = {
    //oncePerSecond(timeFlies)
    oncePerSecond(() => println("Time files like an arrow..."))
  }
}
