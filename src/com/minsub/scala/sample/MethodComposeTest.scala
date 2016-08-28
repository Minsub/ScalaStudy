package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 28..
  */
object MethodComposeTest {

  def main(args: Array[String]) {
    // 1. Compose function
    val ummThenAhem = addAhem _ compose addUmm _
    println(s"ummThenAhem: ${ummThenAhem("well")}")

    // 2. andThen
    val ahemThenUmm = addAhem _ andThen addUmm _
    println(s"ahemThenUmm: ${ahemThenUmm("well")}")

    // 3. Partial Function
    val one:PartialFunction[Int, String] = { case 1 => "one"}
    println(s"PartialFunction: one(1): ${one(1)}, one.isDefinedAt(1): ${one.isDefinedAt(1)}")

    val two:PartialFunction[Int, String] = { case 2 => "two"}
    val three:PartialFunction[Int, String] = { case 3 => "three"}
    val wildcard:PartialFunction[Int, String] = { case _ => "something else"}

    val p = one orElse two orElse three orElse wildcard

    println(s" p(1): ${p(1)}, p(6): ${p(6)}")
  }


  def addUmm(x: String) = x + " umm"

  def addAhem(x: String) = x + " ahem"

}
