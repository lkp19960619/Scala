package genericity.upperbounds

/**
  * 下边界
  * 语法：[T >:s]，限定T类型必须是S的父类型或者是S本类型
  */
class Animals

class Dog extends Animals

class Car

class Keeper[T >: Dog] {
  //表示Keeper的实现类只能饲养Dog或者Dog的父类
  def keeper(d: T): Unit = {
    println("饲养狗的同类：" + d.getClass)
  }
}

object Keeper {
  def main(args: Array[String]): Unit = {
    new Keeper[Dog].keeper(new Dog)
    new Keeper[Animals].keeper(new Animals)
//    new Keeper[Car]
  }
}
