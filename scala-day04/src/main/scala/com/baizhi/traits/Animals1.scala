package com.baizhi.traits

/**
  * 动态混入，常用来扩展类的功能，又不想破坏类的结构或者声明
  */
trait Animals1 {
  println("动物")
  def eat(): Unit
}

trait Sheep extends Animals1 {
  println("绵羊")
  //实现特质声明的方法
  override def eat(): Unit = {
    println("吃草")
  }

  def run = println("在跑...")

  def sleep
}

trait Monkey extends Animals1 {
  println("猴子")
  //实现特质中声明的方法
  override def eat(): Unit = {
    println("吃桃子")
  }
}

class Person extends Animals1 {
  println("人")
  //类需要实现特质中的方法
  override def eat(): Unit = {
    println("吃食物...")
  }
}

object Person {
  def main(args: Array[String]): Unit = {
    val person = new Person with Sheep with Monkey {
      override def sleep: Unit = println("睡觉觉！！！")
    } //动态混入
//    person.eat() //Person和Sheep中都有eat方法，调用时从右往左调用
//    person.sleep
//    person.run
  }

}
