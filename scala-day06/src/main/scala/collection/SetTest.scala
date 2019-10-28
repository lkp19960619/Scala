package collection

object SetTest {
  def main(args: Array[String]): Unit = {
    //Set集合的不可变和可变
    //1、使用伴生对象去初始化一个Set集合
    val s1 = Set(1, 2, 3)
    //2、初始化一个可变的Set集合
    val s2 = scala.collection.mutable.Set(2, 3, 4)

    val s3 = s1 + 4
    //往可变集合中添加数据不会返回一个新的集合
    s2 += 4
    println(s1 & s2)
    println(s1 | s2)
    println(s1.mkString(","))
    println(s2.mkString(","))
    println(s3.mkString(","))
  }
}
