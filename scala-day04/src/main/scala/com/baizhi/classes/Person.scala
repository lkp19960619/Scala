package com.baizhi.classes

/**
  * 2、protected修饰符的作用范围是伴生类、伴生对象以及子类
  * 3、默认修饰符的作用范围是伴生类、伴生对象、子类、同包以及同一文件
  */
class Person {
  protected var name: String = ""
  var age: Int = 23
}

class Man extends Person {
  def run = {
    s"$name,正在疯狂的奔跑"
  }
}

object Man {
  def main(args: Array[String]): Unit = {
    val man = new Man
    man.name = "李开鹏"
    println(man.run)
  }
}

class Pupil {
  def Student() = {
    val person = new Person
    //在Person这一个类中age声明的是默认类型的变量，所以在非子类也可以使用
    println(s"Hello,I am "+person.age+"years old")
  }
}
