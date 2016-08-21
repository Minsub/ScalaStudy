package com.minsub.scala.sample.scalaclass

import beans._
/**
  * Created by jiminsub on 2016. 8. 15..
  */
object ScalaClassTest2 {

  class SPerson(@BeanProperty var name:String)
  // @BeanProperty는 필수가 아닙니다. 자바 스타일의 getter와 setter가 필요한 경우에만 사용하세요.

  // 자바 스타일 클래스
  class JPerson() {
    var _name: String = null
    def this(_name:String) = {
      this()
      this._name = _name
    }

    // 스칼라 스타일의 getter, setter
    def name_=(_name:String) = this._name = _name
    def name = this._name

    // 자바 스타일의 getter, setter
    def getName() = name
    def setName(name:String) = this.name = name
  }

  def main(args: Array[String]): Unit = {
    val jp = new JPerson("자바 스타일")
    val sp = new SPerson("스칼라 스타일")

    println(jp.name)
    println(sp.name)

    jp.name += " 싫어요!"
    sp.name += " 좋아요!"

    println(jp.getName)
    println(sp.getName)
  }
}
