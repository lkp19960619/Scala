package implicits

/**
  * 隐式值
  */
object ImplicitValue {
  implicit val name: String = "zhangsan"
  def main(args: Array[String]): Unit = {
    //隐式值声明在对象内部或者作用域
    //implicit val name: String = "zhangsan"
    val newValue = implicitly[String]
    println(newValue)
  }
}
