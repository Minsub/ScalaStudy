package com.minsub.scala.study

/**
  * Created by hmm1115222 on 2016-10-07.
  */
object TestMethod {

  def addOne(n:Int): Int = n + 1
  def three() = 1 + 2 //return type 생략 가능

  def test1() = { "this is TEST" }
  def test2() { "this is TEST" }

  def echo(args:String*): Unit = { // 인자 타입에 * 를 붙히면 동적 으로 인풋 파라메터를 받을 수 있다. (java에서 ...과 같음)
    for (s <- args) {
      println(s)
    }
  }

  def main(args: Array[String]): Unit = {
    println(addOne(2))
    println(three())
    println(three) // 인자가 없는 method 는 () 생략 가능

    println(s"TEST1 $test1")
    println(s"TEST2 $test2")


    // Literal
    val increase = (x:Int ) => {println("increase!!"); x + 1}
    println(increase(5))

    val list = List(1,2,3,4,5)
    list.foreach(n => println("%s to %s".format(n, n * 2)))

    println(list.filter((n:Int) => n < 3))
    println(list.filter(n => n < 3))
    println(list.filter(_ < 3)) // _을 사용하면 (n:Int) => n ... 을 대채한다.

    echo("Hello", "World","What")


    // 함수 설정시 val과 def의 차이
    // val로 선헌할시 생성시 값이 정해지므로 동일한 값을 가짐
    // def는 호출시에 새로 생성하기 떄문에 값이 호출시마다 다름
    val t1: () => Int = {
      val r = util.Random.nextInt
      () => r
    }
    def t2: () => Int = {
      val r = util.Random.nextInt
      () => r
    }

    println("Test1: %s".format(t1()))
    println("Test1: %s".format(t1()))
    println("Test1: %s".format(t1()))
    println("Test2: %s".format(t2()))
    println("Test2: %s".format(t2()))
    println("Test2: %s".format(t2()))

  }
}
