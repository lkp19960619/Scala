package array

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks

object Array05 {
  def main(args: Array[String]): Unit = {
    val a1 = Array(1, 2, 3, 4, 5, -5, -4, -3, 8, 5, 3)
    var p = 0
    Breaks.breakable {
      for (n <- a1) {
        if (n < 0) {
          p = n
          Breaks.break()
        }
      }
    }
    val a2 = ArrayBuffer[Int]()
    for (m <- a1) {
      if (m > 0 || m == p) {
        a2 += m
      }
    }
    println(a2.toArray.mkString(","))
  }
}
