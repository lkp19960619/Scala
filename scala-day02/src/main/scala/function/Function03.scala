package function

/**
  * 函数的默认值
  */
object Function03 {
  def main(args: Array[String]): Unit = {
    println(m1())
    println(m1("welcome",15,15.3))
  }
  def m1(arg1:String="Hello",arg2:Int=10,arg3:Double=20.6)={
    arg1+"\t"+arg2+"\t"+arg3
  }
}
