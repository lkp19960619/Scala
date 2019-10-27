package genericity

/**
  * 泛型类
  */
class Student[T, K](var name: T, var sex: K){//声明一个泛型类
  override def toString: String = name+"\t"+sex
}

object Student {
  def main(args: Array[String]): Unit = {
    //在创建对象的时候指定泛型信息
    val s1 = new Student[String,Boolean](name = "Huxz",true)
    println(s1)

    //类型推导，根据输入的值自动推断泛型
    val s2 = new Student("Liucy",false)
    println(s2)
  }
}
