package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object MatchTest {

  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case t: String => t + "s"
    }
  }


  def main(args: Array[String]) {
    val times = 1

    val timeString = times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "others"
    }

    val timeString2 = times match {
      case i if i == 1 => "one"
      case i if i == 2 => "two"
      case _ => "others"
    }
    println(s"times: ${times}, timeString: ${timeString}, timeString2: ${timeString2}")

    println(s"bigger(1): ${bigger(1)}")
    println(s"bigger(-1): ${bigger(-1)}")
    println(s"bigger(0.5): ${bigger(0.5)}")
    println(s"bigger('ABC'): ${bigger("ABC")}")
  }

}
