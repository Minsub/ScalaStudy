package com.minsub.scala.test

/**
  * Created by jiminsub on 2016. 8. 25..
  */
object TraitTest {
  class Date(y:Int,m:Int,d:Int) extends Ord {
    def year = y
    def month = m
    def day = d
    override def toString(): String = year + "-" + month + "-" + day

    override def equals(that: Any): Boolean = {
      return that.isInstanceOf[Date] && {
        val o = that.asInstanceOf[Date]
        return o.day == day && o.month == month && o.year == year
      }
    }

    override def <(that: Any): Boolean = {
      if (!that.isInstanceOf[Date])
        println("error!!")

      val o = that.asInstanceOf[Date]
      return (year < o.year) || (year == o.year && (month < o.month || (month == o.month && day < o.day)))
    }
  }

  trait Ord {
    def < (that: Any): Boolean
    def <=(that: Any): Boolean =  (this < that) || (this == that)
    def > (that: Any): Boolean = !(this <= that)
    def >=(that: Any): Boolean = !(this < that)
  }

  def main(args:Array[String]): Unit = {
    val date1 = new Date(2004, 1, 2)
    val date2 = new Date(2002, 1, 3)

    println("date1 < date2: " + (date1 < date2))
    println("date1 >= date2: " + (date1 >= date2))

  }

}
