
import java.text.SimpleDateFormat
import java.util.Date

/**
  * 视图限定  尝试通过隐式转换将T类型转换成Date类型
  * @param  first 传进来的是字符串
  */
class Convert[T <% Date](val first:T) {
  def print(): Unit ={
    println(first.toLocaleString)
  }
}
object Convert{
  //定义隐式转换函数
  implicit def str2Date(str:String):Date={
    new SimpleDateFormat("yyyy-MM-dd").parse(str)
  }

  def main(args: Array[String]): Unit = {
    val c1 = new Convert[String]("2018-10-10")
    c1.print()
  }
}

