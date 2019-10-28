package collection

import java.util.function.Consumer

import scala.collection.mutable._
import scala.collection.JavaConverters._

object ConvertTest {
  def main(args: Array[String]): Unit = {
    //scala集合转换为java中的集合
    val l = ListBuffer(1, 2, 3).asJava
    l.add(4)
    for (x<-0 until (l.size)){
      println(l.get(x))
    }

    //将java中的集合转换为scala中的集合
    val l1 = l.asScala
    println(l1)
  }
}
