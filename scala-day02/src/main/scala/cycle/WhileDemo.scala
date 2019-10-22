package cycle

object WhileDemo {
  def main(args: Array[String]): Unit = {
    var a = 10
    while (a > 0) {
      println(s"$a")
      //在scala中没有a++和a--
      a -= 1
    }
    println("===============优雅的分割线===================")
    //计算1-100的和
    var sum = 0
    var n = 100
    while (n > 0) {
      sum += n
      n -= 1
    }
    println("1-100的和是：" + s"$sum")
    println("===============优雅的分割线===================")
    //从控制台输入任意整数，求1-任意整数的的数值之和
    val str = readLine("请输入任意整数：")
    //String--->Int
    var int = str.toInt
    var sum1 = 0
    while(int>0){
      sum1+=int
      int-=1
    }
    println("1-n的和为："+s"$sum1")
  }

}
