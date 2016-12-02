package com.minsub.scala.study2

import scala.collection.mutable

/**
  * Created by hmm1115222 on 2016-12-02.
  */
object Summary {

  class Cat extends Animal

  class Dog extends Animal

  class Animal {
    def bite() = println("Bite!!")
  }

  class TT[+Animal]

  class CC[+T]

  def test[T](x: T) = {

  }

  def test0(x: Animal) = {
    x.bite()
  }

  def test2[T >: Animal](x: T) = {

  }

  def test3[T <: Animal](x: T) = {
    x.bite()
  }

  def main(args: Array[String]): Unit = {

    val cat = new Cat
    val dog = new Dog

    val animal = new Animal

    val a = new TT[String]


    test3(dog)
  }
}
