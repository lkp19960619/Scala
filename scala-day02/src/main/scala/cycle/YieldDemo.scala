package cycle

object YieldDemo {
  def main(args: Array[String]): Unit = {
    //yield
    //在for循环输出的数据时1,3,7,9
    val result = for (n <- 1 to 10 if n % 2 == 1 if n != 5) yield n * 5
    println(result)
    //还可以把括号里面for循环的条件写到大括号里面，并且可以换行
    val result1 = for {n <- 1 to 10
                       if n % 2 == 0
                       if n != 6} yield n * 6
    println(result1)
  }


}
