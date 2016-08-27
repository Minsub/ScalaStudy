package com.minsub.scala.sample.collection

/**
  * Created by jiminsub on 2016. 8. 27..
  */
object FunctionCombinatorTest {

  def main(args: Array[String]) = {
    val list = List(1,2,3,4,5,6,7,8,9,10)

    // 1. map
    println(s"map(i=>i*2): ${list.map(i => i * 2)}")
    val funcMap:(Int => Int) = (i => i * 1)
    println(s"map(i=>i*2): ${list.map(funcMap)}")

    // 2. foreach: map은 결과를 위해서 사용하고 foreach는 반복해서 처리해야할 때 사용
    list.foreach(i => print(i+","))
    println()

    // 3. filter
    println(s"filter(i=>i%2==0): ${list.filter(_ % 2 == 0)}")

    // 4.zip: 두 리스트의 원소들을 Tuple로 만들어서 List로 반환한다
    val zip = List(1,2,3,4).zip(List("a","b","c"))
    println(s"zip: ${zip}")

    // 5. partition: List를조건에 맞는 List와 아닌 List의 Tuple1로 나눠서 만든다
    val partition = list.partition(_ % 2 == 0)
    println(s"partition: ${partition} class: ${partition.getClass}")

    // 6. find: 조건에 만족하는 값중 첫번째 return. option으로 리턴
    println(s"find: ${list.find(_ > 5).getOrElse("empty")}")

    // 7. drop & dropWhile: drop은 입력받은 숫자만큼 제외하고 List 를 만듬
    println(s"drop: ${list.drop(5)}")
    println(s"dropWhile: ${list.dropWhile(_ < 4)}")

    // 8. foldLeft, foldRight: Java 8의 reduce 개념. 첫 인자는 초기값 그리고 _1누적값 _2는 next value
    println(s"foldLeft: ${list.foldLeft(0) {_ + _}}")
    println(s"foldLeft: ${list.foldRight(0) {(a:Int, b:Int) => println(a+", "+b); a+b}}")

    // 9. flatten: 리스트위 원소를 상위로 올림
    val flat = List(List(1,2,3), List(3,4,5))
    println(s"flatten: ${flat.flatten}")

    // 10. flatMAp: flatten과 Map을 합셩
    println(s"flatMap: ${flat.flatMap(x => x.map(_ * 2))}")
    println(s"flatMap (map + flatten): ${flat.map(x => x.map(_*2)).flatten}")

    // 11
    println(s"ourMap: ${ourMap(list, (_ * 2))}")
  }

  // 11. custom function combinator
  def ourMap(num: List[Int], f: (Int=>Int)): List[Int] = {
    num.foldRight(List[Int]()) { (x:Int, xs: List[Int]) =>
      f(x) :: xs
    }
  }

}
