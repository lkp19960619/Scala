package com.baizhi.traits

/**
  * 声明特质trait
  */
trait Animals {
  //定义一个抽象方法,不需要abstract关键字
  def eat():Unit
  //如果接口中有具体的方法
  def sleep(name:String)={
    s"$name 在睡觉..........."
  }
}
//用一个类实现这个特质
class Dog extends Animals{
  override def eat(): Unit = println("dog eat shit")
}
object AnimalsDemo{
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.eat()
    println(dog.sleep("小黑黑"))

  }
}
