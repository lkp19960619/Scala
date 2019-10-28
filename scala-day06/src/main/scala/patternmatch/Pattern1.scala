package patternmatch

/**
  * 模式匹配中的值匹配
  */
object Pattern1 {
  def main(args: Array[String]): Unit = {
    val city = readLine("city:")
    city match {
      case "bj" => println("北京")
      case "sh" => println("上海")
      case "gz" => println("广州")
      case "zz" => println("郑州")
      case _ => println("其它城市")

    }
  }
}
