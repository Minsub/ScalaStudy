package com.minsub.scala.sample

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object AnonymousFunctionTest {
  def main(args: Array[String]): Unit = {
    // ① 명시적으로 타입을 선언하는 익명함수
    val call1 = doWithOneAndTwo((x: Int, y: Int) => x + y)

    // ② 코드4번째 줄에서 익명함수의 매개변수 타입(Int, Int)을 이미 정했기 때문에 생략
    val call2 = doWithOneAndTwo((x, y) => x + y)

    // ③ 이렇게 요약할 수도 있음
    val call3 = doWithOneAndTwo(_ + _) // 매개변수의 순서대로 _에 대입됨

    println(call1, call2, call3)


    val v1 = doing((x:Int, y:Int) => x + y)
    val v2 = doing((x,y) => x + y)
    val v3 = doing(_ + _)

    println("my: ", v1, v2, v3)


    // 변수에 함수를 선언한다
    val f = (x:Int,y:Int) => x + y
    println(f.getClass + ", f: " + f(10, 5))

    // Partial Application: _ 로 인자값을 선언하면 return값이 함수가 된다
    val f2 = f(5,_:Int)
    println("f2(7): " + f2(7))

    // curried functions
    println("curried func: " + curFunc(3)(2) )
    println("not curried func: " + notCurFunc(3,2) )
  }

  // 매개변수로 받은 익명함수에 1과 2를 넣어서 실행하는 메소드
  def doWithOneAndTwo(f: (Int, Int) => Int) = {
    f(1, 2)  //return은 생략되었지만, f(1, 2)의 결과가 return
  }

  def doing(func: (Int, Int) => Int) = {
    func(2, 3)
  }

  // curried functions
  def curFunc(m:Int)(n:Int): Int = m * n
  def notCurFunc(m:Int,n:Int): Int = m * n
}
