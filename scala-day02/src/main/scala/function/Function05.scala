package function

/**
  * 匿名函数
  *
  */
object Function05 {
  def main(args: Array[String]): Unit = {
    //匿名函数没有函数名
    val f1 = (x: Int, y: Int) => x + y
    //变量名后面不加括号输出的是一个对象
//    println(f1)
    println(f1(1,2))
  }
}
