package function

/**
  * def functionName ([参数列表]) : [return type] = { 函数体}
  */
object Function01 {
  def main(args: Array[String]): Unit = {
    sayHi("李开鹏")
    println(sum(3,5))
  }

  //无返回值
  def sayHi(str: String): Unit = {
    println("Hello:" + str)
  }
  //scala语言函数的返回值类型，支持自动推导
  def sum(x:Int,y:Int)=x+y

}
