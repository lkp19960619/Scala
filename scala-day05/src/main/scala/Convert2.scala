import java.text.SimpleDateFormat
import java.util.Date

/**
  *
  * @param second
  * @param ev$1
  * @tparam T
  */
class Convert2[T <% Date](val second:T) {
  def print(): Unit ={
    println(second.toLocaleString)
  }
}
object Convert2{
  def main(args:Array[String]):Unit={
    //将String类型转换成Date类型
    val date = new Convert2[String]("2019-10-27")
    date.print()
  }
  implicit def str2Date(str:String):Date={
    new SimpleDateFormat("yyyy-MM-dd").parse(str)
  }
}
