package cycle

object ForDemo {
  def main(args: Array[String]): Unit = {
    //1-100之和
    //    var sum = 0
    //    for (n <- 1 to 100){
    //      sum += n
    //    }
    //    println("1-100的数值和是："+sum)

    //嵌套for循环
    for (m <- 1 to 9) {
      for (n <- 1 to m) {
        print(s"$m*$n=" + m * n + "\t")
      }
      println()
    }
    println("==============华丽的分割线==================")
    for (m <- 1 to 9; n <- 1 to m) {
      print(s"$m*$n=" + m * n + "\t")
      if (m == n) println()
    }
    println("==============华丽的分割线==================")
    //for循环遍历集合
    val list = List("a", "b", "c", "d", "e")
    for (m <- list) {
      println(m)
    }
    println("==============华丽的分割线==================")
    //打印1 3 5 7 9
    for (n <- 1 to 10 by 2) {
      println(n)
    }
    println("==============华丽的分割线==================")
    //for循环过滤（if守卫）
    for (n <- 1 to 10 if n % 2 == 0 if n > 5) {
      println(s"$n")
    }
    println("==============华丽的分割线==================")

  }
}
