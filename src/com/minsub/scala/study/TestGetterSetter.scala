package com.minsub.scala.study

import scala.beans.BeanProperty

/**
  * Created by hmm1115222 on 2016-10-07.
  */
object TestGetterSetter {

  class Person {
    var name: String = ""
    var age: Int = 0

    override def toString: String = name + " / " + age
  }

  class Person2 {
    private var _name: String = ""

    def name: String = _name
    def name_(n: String) = _name = n
    override def toString: String = s"Person2: $name "
  }


  class Person3 {
    @BeanProperty
    var name:String = ""
    @BeanProperty
    var age: Int = 0
    override def toString: String = s"Person3: $name / $age"
  }

  def main(args: Array[String]): Unit = {

    val p = new Person
    p.age=4
    p.name="Unknown"
    println(p)

    val p2 = new Person2
    p2.name_("MS")
    println(p2)

    val p3 = new Person3
    p3.setName("P3")
    p3.setAge(300)
    println(p3)
  }
}
