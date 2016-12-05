package com.minsub.scala.sample

import scala.collection.mutable

/**
  * Created by jiminsub on 2016. 8. 28..
  */
object ImplicitMethodTest {

  class Button {
    val listAction = mutable.ArrayBuffer[ActionListener]()
    def addClickListener(listener: ActionListener): Unit = {
      listAction += listener
    }
    def click(): Unit = {
      listAction.foreach(action => action.perfomed())
    }
  }

  // Listener Trait
  trait ActionListener {
    def perfomed()
  }

  def main(args: Array[String]): Unit = {
    val button = new Button()

    //일반적인 Add Listener
    button.addClickListener(new ActionListener {
      override def perfomed(): Unit = println("삐약삐약")
    })

    // 암시적 변환을 위한 메소드 선언
    implicit def functionToAction(f: () => Unit) = {
      new ActionListener {
        override def perfomed(): Unit = f()
      }
    }

    button.addClickListener(functionToAction(() => println("음메음메")))

    button.addClickListener(() => println("아아악"))

    button.click()
  }
}
