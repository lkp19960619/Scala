package patternmatch

/**
  * 模式匹配中的集合元素匹配
  */
object Pattern5 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    //匹配集合元素数量
    list match {
      case List(e1) => println("匹配1个元素")
      case List(e1, e2) => println("匹配2个元素")
      case List(e1, e2, e3) => println("匹配3个元素")
      case List(e1, e2, e3, e4) => println("匹配4个元素")
      case List(_*) => println("匹配任意个元素")
    }

    //匹配集合元素内容
    list match {
      case List(1) => println("匹配1个元素")
      case List(1,2) => println("匹配2个元素")
      case List(1, 2, 3) => println("匹配3个元素")
      case List(1, 2, 3, 4) => println("匹配4个元素")
      case List(1,_*) => println("匹配以1开头的任意集合")
    }

    //匹配类型 只支持Array类型
    val a1:Any = Array[Int](1,2,3)
    a1 match {
      case x:Array[Int] =>println("array[Int]")
      case y:Array[String]=>println("array[String]")
      case _=>println("array[other]")
    }
  }
}
