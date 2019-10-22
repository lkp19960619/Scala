package array

/**
  * 冒泡排序
  */
object Array02 {
  def main(args: Array[String]): Unit = {
    //声明数组
    val a = Array(2, 13, 4, 1, 56, 6, 17, 12, 31)
    for (n <- 0 until (a.length)) {
      for (m <- 0 until (a.length - n - 1)) {
        if (a(m) > a(m + 1)) {
          val tmp = a(m)
          a(m) = a(m + 1)
          a(m + 1) = tmp
        }
      }
    }
    for (n <- a) {
      println(n)
    }
  }
}
