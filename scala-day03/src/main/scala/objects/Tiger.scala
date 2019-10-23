package objects

/**
  * apply方法和unapply方法
  * apply方法用在object中一般作为工厂方法用于产生Class对象
  * unapply方法用来接收一个对象，从中获取对象的值
  */
class Tiger(var kind: String) {

}

object Tiger {
  //在伴生对象中使用apply方法new一个有参对象，方法的返回值
  def apply(kind: String): Tiger = new Tiger(kind)

  //定义unapply方法从对象中提取值
  def unapply(arg: Tiger): Option[String] = {
    if (arg == null) None
    else {
      Some(arg.kind)
    }
  }

  def main(args: Array[String]): Unit = {
    var t1 = Tiger.apply("东北虎")
    var t2 = Tiger("孟加拉斯虎")
    println(t1.kind)
    println(t2.kind)
    val option = Tiger.unapply(t2)
    println(option)

    val Tiger(kind) = t2
    println(kind)
  }

}

