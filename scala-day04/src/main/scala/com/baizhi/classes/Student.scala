package com.baizhi.classes

/**
  * scala中的访问修饰符
  * 1、private修饰符的作用范围是伴生类和伴生对象
  *
  */
class Student {
  private var name: String = ""
  def sayHello()={
    s"name:$name,sex:"+Student.sex
  }
}

object Student {
  //伴生类也可以获取伴生对象中的私有成员
  private var sex: Boolean = false

  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "zhangsan"
    println(student.name)
    println(student.sayHello())
  }
}
