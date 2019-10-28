package collection

import scala.collection.mutable.ListBuffer

object ListBufferTest {
  def main(args: Array[String]): Unit = {
    //声明可变列表
    var list = ListBuffer(1, 2, 3, 4, 5)
    //尾部追加数据
    list.append(6)
    list += (7)
    //头部追加数据
    list.prepend(0)
    -1 +=: list
    //移除数据
    list.remove(2)
    //把可变列表中元素为5 的内容移除
    list -= 5
    //将集合中的元素追加到ListBuffer中
    list ++= List(8, 9, 10)
    /**
      * 集合中的操作符中有=，表示对集合中元素的操作，不会产生新的集合
      * 而如果只有-，没有=，操作的结果会产生一个新的集合
      */
    val list1 = list - 9
    println(list.mkString(","))
    println(list1.mkString(","))
  }

}
