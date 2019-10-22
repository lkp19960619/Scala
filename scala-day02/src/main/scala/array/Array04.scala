package array

/**
  * 多维数组
  */
object Array04 {
  def main(args:Array[String]):Unit={
    //声明多维数组
    val a = Array.ofDim[Int](10,5)
    //使用二维数组
    println(a(0)(2))
  }
}
