package com.baizhi.traits

trait A {
  val name: String
}

trait B {
  //在B中混入特质A，B可以使用A的成员
  this: A =>
  def sayHi = s"Hello:$name"
}

class C(val name: String) extends B with A {}

object C {
  def main(args: Array[String]): Unit = {
    val c = new C("zhangsan")
    println(c.sayHi)
  }
}
