package function

object Function04 {
  def main(args: Array[String]): Unit = {
    //递归的方式求1-100之和
    println(m1(100))
    println(m2(5))
  }

  def m1(n: Int): Int = {
    if (n > 0) {
      n + m1(n - 1)
    } else {
      0

    }
  }

  def m2(n: Int): Int = {
    if (n > 0){
      n*m2(n-1)
    }else{
      1
    }
  }
}
