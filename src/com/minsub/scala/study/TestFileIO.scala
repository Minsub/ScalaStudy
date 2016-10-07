package com.minsub.scala.study

import scala.io.Source

/**
  * Created by hmm1115222 on 2016-10-06.
  */
object TestFileIO {
  def main(args: Array[String]): Unit = {
    for(line <- Source.fromFile("C:/test.txt").getLines())
      println(line)
  }
}
