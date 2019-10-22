package array

object Array01 {
  def main(args: Array[String]): Unit = {
    //数组的定义
    val a1 = new Array[Int](10)
    val a2 = new Array[String](5)
    val a3 = Array[Long](10, 20, 30)
    val a4 = Array('a', 'b', 'c', 'd')
    //数组的使用
    //访问数组元素使用  变量名(下标)
    println(a1(0))
    println(a2(4))
    println(a4(0).toInt)
    //遍历数组
    for (n <- 0 until (a4.length)) {
      println(a4(n))
    }
    println("================================")
    for (n <- a4) {
      println(n)
    }
    println("================================")
    for (n <- a4.indices) {
      println(a4(n))
    }
  }
}
