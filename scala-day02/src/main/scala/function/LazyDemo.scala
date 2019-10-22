package function

import scala.io.Source

/**
  * Lazy懒加载函数，会在调用的时候才初始化
  * 懒加载的好处可以节省资源，提高程序的效率
  */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    //加载本地文件
//    val source = Source.fromFile("D:\\db_dangdang.sql")
    //正常的函数如果不是懒加载函数，如果路径错误会报错
//    val source = Source.fromFile("")
//    懒加载函数不会报错，只会在函数被调用的时候报错
    lazy val source = Source.fromFile("")
    //在被调用的时候报错
    println(source.mkString)

  }
}
