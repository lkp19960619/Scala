package genericity

object GenericDemo1 {
  def main(args: Array[String]): Unit = {
    val a1 = Array("竹子","牛肉","猪肉","狗肉")
    eat(a1)
  }
  //定义吃方法
  def eat[T](x:Array[T]):Unit={//泛型函数 会根据应用的类型自动推断类型
    println(x.mkString(","))
  }
}
