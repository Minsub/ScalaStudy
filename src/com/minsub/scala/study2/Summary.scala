package com.minsub.scala.study2

import scala.collection.mutable

object Summary {

  def main(args: Array[String]): Unit = {
    // yield
    val a = for (i <- 1 to 3) yield i  // Vector(1, 2, 3)
    println(a)

    val b = for (i <- 1 to 3) yield i * 100 // Vector(100, 200, 300)
    println(b)

    val c = for (i <- 1 to 3) yield i > 2 // Vector(false, false, true)
    println(c)

    val d = for (i <- 1 to 3; if i==1; if i==2) yield i  // Vector(1,2)
    println(d)

    val e = for (element <- List.range(1, 4)) yield element  // List(1, 2, 3)
    println(e)

    // Tuple만들기
    val f = for (i <- List("A","B"); j <- List(1,2,3)) yield (i, j)  // List((A,1), (A,2), (A,3), (B,1), (B,2), (B,3))
    println(f)

    // 중복찾기
    val g = for (i <- List(1,3,5); j <- List(1,2,3); if i==j) yield i  // List(1, 3)
    println(g)
  }
}


