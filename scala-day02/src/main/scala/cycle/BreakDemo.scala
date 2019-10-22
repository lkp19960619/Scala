package cycle

import scala.util.control.Breaks

object BreakDemo {
  def main(args: Array[String]): Unit = {
    //在scala中需要跳出循环需要把代码块放在Breaks的breakable代码里面
    Breaks.breakable{
      for (n <- 1 to 10) {
        if (n == 5) {
          //在scala中使用Breaks中的break()方法跳出循环
          Breaks.break()
        }
        println(n)
      }
    }
  }
}
