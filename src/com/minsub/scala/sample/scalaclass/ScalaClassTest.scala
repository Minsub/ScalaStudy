package com.minsub.scala.sample.scalaclass

/**
  * Created by jiminsub on 2016. 8. 15..
  */
object ScalaClassTest {

  // ① 단순한 클래스
  class Person1(fname:String, lname:String)

  // ② 메소드를 가지는 클래스
  class Person2(fname:String, lname:String){
    def greet = s"${lname}${fname}님 안녕하세요!" // public한 method
  }

  // ③ public한 val(read only) 필드
  class Person3(fname:String, lname:String){
    val fullName = s"${lname}${fname}" // public한 val(read only) 필드
    def greet = s"${fullName}님 안녕하세요!" // public한 method
  }

  /* ④
   * val로 선언된 fname는 getter가 자동으로 생성되고
   * var로 선언된 lname은 getter와 setter가 자동으로 생성 */
  class Person4(val fname:String, var lname:String)



  def main(args: Array[String]): Unit = {
    // ① 단순한 클래스
    val p1 = new Person1("중기", "송")
    //p1.fname과 p1.lname의 값을 외부에서 가져올 수 없습니다.

    // ② 메소드를 가지는 클래스
    val p2 = new Person2("혜교", "송")
    // 이 경우에도 p2.fname과 p2.lname의 값을 외부에서 가져올 수는 없습니다.
    // 정의된 greet 메소드를 출력합니다.
    println(s"② ${p2.greet}")

    // ③ public한 read only(val) fullname을 가지는 클래스
    val p3 = new Person3("구", "진")
    println(s"③ ${p3.fullName}님께 인사합니다. ${p3.greet}")

    // ④ val fname과 var lname을 가지는 클래스
    val p4 = new Person4("지원", "Kim") {
      override def toString = s"$lname$fname"
    }
    // val로 선언된 p4.fname과 var로 선언된 p4.lname을 외부에서 읽을 수 있음
    println(s"④ ${p4.lname}${p4.fname}")

    // ⑤ Person4클래스를 이용해서 객체를 생성하지만, 해당 객체의 toString메소드만 오버라이드
    val p5 = new Person4("시진", "유") {
      override def toString = s"$lname$fname"
    }
    println(s"⑤ $p5") // 오버라이드된 toString형태로 출력
  }
}
