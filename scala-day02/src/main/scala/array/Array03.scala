package array

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
  * ArrayBuffer
  */
object Array03 {
  def main(args: Array[String]): Unit = {
    val a = ArrayBuffer[Int](10, 20, 30)
    //可变数组中添加内容
    a += 40
    a.+=(50)
    a.+=(60, 70, 80)
    //将指定数组中的内容加入到已有的可变数组中
    a ++= ArrayBuffer(90, 100)
    //截取指定的元素舍弃
    a.trimEnd(3)
    //在指定下标位置插入指定元素
    a.insert(7,80,90,100)
    Sorting.quickSort(a.toArray)

    println(a)
  }
}
