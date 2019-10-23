package classes


/**
  *
  * 主构造器的声明是与类的声明交织在一起的
  * 声明的参数会变成类的成员*
  * 主构造器的方法体是整个类
  *
  * @param color
  * @param age
  */
class Pig(var color: String, var age: Int) {
  var kind: String = ""

  println("主构造器开始")

  println("主构造器结束")
}
