package com.minsub.scala.sample

object ImplicitParameterTest {

  implicit var DefaultPrompt = new Prompt("Default Prompt")

  def greet(name: String)(implicit prompt: Prompt) {
    println(s"$name in ${prompt.out}")
  }

  class Prompt(val out: String)

  def main(args: Array[String]): Unit = {
    val myPrompt = new Prompt("My Prompt")

    greet("Scala")(myPrompt)

    // 2번째 Prompt인자를 주지않아도 정상 수행됨
    greet("Scala")

    // implicit 변수의 값을 변경하면 모두 적용됨
    DefaultPrompt = new Prompt("Changed Prompt")
    greet("Scala")
  }
}
