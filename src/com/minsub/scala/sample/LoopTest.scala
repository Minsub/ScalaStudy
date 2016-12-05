package com.minsub.scala.sample

import scala.util.control.Breaks

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object LoopTest {
  def main(args: Array[String]): Unit = {

    // for
    for (i <- 0 until 10) {
      print(i)
    }

    // while
    var x = 0
    while ( x < 10) {
      print(x)
      x += 1
    }

    var sum = (0 until 10).sum
    println("sum: ", sum)


    // 중첩 루프
    for( a<- 1 to 3){
      for( b <- 10 to 12){
        println(a,b)
      }
    }
    println("중첩된 for문 대신 아래와 같이 쓸 수 있습니다.")
    for( a <- 1 to 3; b <- 10 to 12){
      println(a,b)
    }

    // if
    val likeEggs = false
    // 삼항 연산자대신 이렇게 쓸 수 있습니다.
    val breakfast = if (likeEggs) "계란후라이" else "사과"
    println(breakfast)

    // for + if
    // for 안에서 if를 쓰면 for 조건을 설정 가능하다. ;으로 조건을 추가할 수 있다.
    for( i <- 1 to 20 if i%3 == 0; if i != 9){
      println(i)
    }

    // match (switch문과 유사)
    val selection = "하나"
    selection match {
      case "하나" => println("하나를 선택했습니다.")
      case "둘" => println("둘을 선택했습니다.")
      case _ => println("다른 값")
    }

    // break 문
    val outer = new Breaks
    val inner = new Breaks

    outer.breakable {
      (1 to 3).foreach(i => {
        if (i > 2) {
          outer.break
        }
        inner.breakable {
          (1 to 5).foreach(j => {
            if (j > 3) {
              inner.break
            }
            println(s"$i - $j")
          })
        }
      })
    }

    // yield
    for (i <- 1 to 3) {
      println(i)
    }


  }
}
