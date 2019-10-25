package implicits

/**
  * 隐式转换增强现有类型
  */
object Implicit2 {
  implicit def manToSuperMan(man: Man): SuperMan = new SuperMan(man.name)

  def main(args: Array[String]): Unit = {
    //创建Man对象
    val man = new Man("zhangsan")
    //想要在Man中调用SuperMan中的方法要用到隐式转换来增强现有类型
    man.fly()
  }
}

class Man(val name: String)

class SuperMan(val name: String) {
  def fly() = {
    println("超人会飞")
  }
}
