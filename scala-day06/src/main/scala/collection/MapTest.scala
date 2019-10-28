package collection

object MapTest {
  def main(args: Array[String]): Unit = {

    //声明方式1
    //不可变的Map集合
    val m1 = Map("bj" -> "北京", "tj" -> "天津", "sh" -> "上海")
    //内容可变的Map集合
    val m2 = scala.collection.mutable.Map("bj" -> "北京", "tj" -> "天津", "sh" -> "上海")


    //声明方式2
    //以元组的方式声明
    val m3 =Map(("bj","北京"),("tj","天津"),("sh","上海"))
    val m4 = scala.collection.mutable.Map(("bj","北京"),("tj","天津"),("sh","上海"))

    ///操作
    println(m1("bj"))
    //返回的是一个新的Map集合
    println(m1 +(("gz","广州")))
    m2("sz")="深圳"
    m2.+=(("zz","郑州"))
    m2.-=("sh")
    println(m2)
    val treeMap=scala.collection.SortedMap[String,String]("bj" -> "北京", "tj" -> "天津", "sh" -> "上海")
    println(treeMap)

    //迭代器遍历
    val iterator = m1.keySet.toIterator
    while(iterator.hasNext){
      //拿到一个key
      val key = iterator.next()
      //根据key拿到value
      val value = m1(key)
      println(s"$key  $value")
    }
  }
}
