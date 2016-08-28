package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 28..
  */
object TypePloyTest {


  def main(args: Array[String]) {


    println(s" drop1: ${drop1(List(1,2,3))}")
  }


  def drop1[A](l:List[A]) = l.tail

  def toList[A](a: A) = List(a)

}
