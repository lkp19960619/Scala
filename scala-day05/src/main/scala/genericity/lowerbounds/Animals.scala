package genericity.lowerbounds

/**
  * 上边界
  * 语法:[T <: S]，限定T类型必须是S的子类型
  */
trait Animals

class Dog extends Animals

class Keeper[U <: Animals] {
  //表示Keeper的实现类只能饲养Animal以及Animal的子类
  def keep(a: U): Unit = {
    println("饲养动物：" + a.getClass)
  }
}

object Keeper {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    new Keeper[Dog]().keep(dog)
  }
}
