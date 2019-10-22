package function

/**
  * 可变长参数
  */
object Function02 {
  def main(args: Array[String]): Unit = {
    println(sum(1,2,3,4,5))
  }

  def sum(n: Int*): Int = {
    var sum = 0
    for (m <- n){
      sum += m
    }
    sum
  }
}
