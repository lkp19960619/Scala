package patternmatch

/**
  * 模式匹配中的if守卫，用于区间判断
  */
object Pattern2 {
  def main(args: Array[String]): Unit = {
    val age = readLine("age:").toInt
    age match {
      case _ if age > 60 => println("老年人")
      case _ if age > 40 => println("中年人")
      case _ if age > 14 => println("青年人")
      case _ => println("未成年人")
    }
  }
}
