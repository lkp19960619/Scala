package cycle

object DoWhileDemo {
  def main(args: Array[String]): Unit = {
    //1-100数值之和
    var int = readLine("请输入任意整数：").toInt
    var sum = 0
    do {
      sum+=int
      int-=1
    } while (int>0)
    println("1-100的数值之和是："+s"$sum")
  }
}
