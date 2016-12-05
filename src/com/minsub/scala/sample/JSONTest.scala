package com.minsub.scala.sample

import scala.util.parsing.json._

object JSONTest {


  def main(args: Array[String]): Unit = {
    val json = JSON.parseFull(""" {"name":"Minsub", "lang": ["Java","Scala"]} """)

    print(json) // Some(Map(name -> Minsub, lang -> List(Java, Scala)))


  }
}
