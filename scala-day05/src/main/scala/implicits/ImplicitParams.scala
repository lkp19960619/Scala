package implicits

/**
  * 隐式参数（传值）
  */
object ImplicitParams {
  //声明隐式值
  implicit var num: Int = 10

  def main(args: Array[String]): Unit = {
    val result = sum(10)
    println(result)
  }
  //定义柯里化函数
  //隐式参数只适合单个参数的柯里化函数
  def sum(x:Int)(implicit y:Int)={
    x+y
  }
}
