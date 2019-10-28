package patternmatch

/**
  * 匹配模式中的变量
  * 如果case关键字后面跟着一个变量名，那么匹配的表达式会被赋值给那个变量
  */
object Pattern3 {
  def main(args: Array[String]): Unit = {
    val age = readLine("age:").toInt
    age match {
      case c1 if c1 > 60 => println("老年人：" + c1)
      case c2 if c2 > 40 => println("中年人：" + c2)
      case c3 if c3 > 18 => println("青年：" + c3)
      case _c4 => println("未成年人：" + _c4)
    }
  }
}
