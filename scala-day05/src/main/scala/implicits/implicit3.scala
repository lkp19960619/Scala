package implicits

/**
  * 隐式类
  *
  * @param name
  */
class Man2(val name: String)

object implicit3 {
  def main(args: Array[String]): Unit = {
    val man2 = new Man2("zhangsan")
    man2.fly
    implicit class SuperMan2(man2: Man2) {
      var name: String = _

      def fly = {
        this.name = man2.name
        println(s"$name,在自由的飞翔")
      }
    }
  }
}

