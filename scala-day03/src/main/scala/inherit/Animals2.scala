package inherit

class Animals2 {
  var name:String=""

  //定义一个方法
  def sleep() = println("动物在睡觉")
}

//类继承动物类
class Dog extends Animals2 {
  def this(name:String){
    this()
    this.name=name
  }
  def run: String = s"$name,在田野上愉快的奔跑！！！"

  //方法覆盖,在调用的时候会以子类中的方法为准
  override def sleep() = println("二哈，在睡觉")
}

object Dog {
  def apply(name:String): Dog = new Dog(name:String)

  def main(args: Array[String]): Unit = {
//    val dog = new Dog
//    dog.name = "二哈"
//    dog.sleep()
//    println(dog.run)
    val dog = Dog("阿拉斯加")
    println(dog.name)
    //判断类型是否兼容
    println(dog.isInstanceOf[Animals2])
    //类型转换，可以把一个类型转换成另一个类型
    println(dog.asInstanceOf[Animals2])
  }
}
