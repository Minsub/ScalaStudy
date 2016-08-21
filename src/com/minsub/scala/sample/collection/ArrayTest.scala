package com.minsub.scala.sample.collection

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object ArrayTest {
  // 배열의 내용을 출력하는 메소드
  def printArray[K](array:Array[K]) = println(array.mkString("Array(" , ", " , ")"))

  def printArray2[T](array:Array[T]) = println(array.mkString("Array(", ", ", ")"))

  def main(args: Array[String]): Unit = {

    // ① Array[Int]
    val array1 = Array(1, 2, 3)
    print("① ")
    printArray(array1)

    // ② Array[Any]
    val array2 = Array("a", 2, true)
    print("② ")
    printArray(array2)

    // ③ 배열의 값을 읽고 쓰기
    val itemAtIndex0 = array1(0)
    array1(0) = 4
    print("③ ")
    printArray(array1)

    // ④ 배열을 붙일때는 ++연산자를 이용
    // 앞에 붙일때는 +:, 뒤에 붙일때는 :+ 연산자
    val concatenated = "앞에 붙이기" +: (array1 ++ array2) :+ "뒤에 붙이기"
    print("④ array1과 array2를 더하면: ")
    printArray(concatenated)

    // 값으로 index찾기
    array2.indexOf("a")

    // ⑤ 다른 값만 가져오기
    val diffArray = Array(1,2,3,4).diff(Array(2,3))
    print("⑤ Array(1,2,3,4).diff(Array(2,3))의 결과: ")
    printArray(diffArray)


    val personArray = Array(("솔라",1), ("문별",2), ("휘인",3))
    // ⑥ Find 메소드를 이용해서 findByName이라는 메소드 생성
    // Find는 조건에 맞는 값을 찾으면 검색을 중단
    // getOrElse는 일치하는 값이 없을 경우 넘겨줄 기본 값
    // getOrElse가 없을때 일치하는 값이 없으면 None
    def findByName(name:String) = personArray.find(_._1 == name).getOrElse(("화사",4))
    val findSolar = findByName("솔라")  // 값("솔라",1)을 찾아서 넘겨줌
    val findSun = findByName("태양")  // 값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
    println(findSolar)
    println(findSun)
  }
}
