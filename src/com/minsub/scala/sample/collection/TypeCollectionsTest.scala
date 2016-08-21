package com.minsub.scala.sample.collection

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object TypeCollectionsTest {
  class Animal()
  class Dog() extends Animal()

  def main(args: Array[String]): Unit = {
    // Animal과 Dog이 공통으로 상속받는 최상위 타입은 Animal이므로 아래 코드는 정상 실행
    val array:Array[Animal] = Array(new Animal(), new Dog())
    // val wrongArray:Array[Dog] = Array(new Animal(), new Dog()) 올바르지 않은 타입

    // List도 같은 원리로 동작(Animal이 List의 element의 타입)
    val list:List[Animal] = List(new Animal(), new Dog())

    // Set도 같은 원리로 동작(Animal이 Set의 element의 타입)
    val set:Set[Animal] = Set(new Animal(), new Dog())

    // Map도 같은 원리로 동작
    val map:Map[String, Animal] = Map("Animal" -> new Animal(), "Dog" -> new Dog())
  }
}
