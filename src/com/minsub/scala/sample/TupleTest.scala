package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object TupleTest {
  def main(args: Array[String]): Unit = {
    val t1 = new Tuple3(1, "hello", true)
    val t2 = (1, "hello", true)

    println(t2)

    val numbers = (1,2,3,4)
    val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4
    println(sum)

    // Multi return
    val (c,d) = ("hello","world")
    val (a,b) = swap(c ,d)
    println(c,d)
    println(a,b)

    // Multi input param
    val (x, y, z, q, python, java) = (1, 2, 3, true, false, "no!")
    println(x, y, z, q, python, java)
  }

  def swap(x:String, y:String) = (y, x)
}
