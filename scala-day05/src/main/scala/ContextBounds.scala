/**
  * 需求：使用上下文界定+隐式值的方式，比较两个Person对象的年龄大小
  * 需求：使用Ordering实现比较
  */
object ContextBounds {
  //声明一个隐式值
  implicit val ordering = new Ordering[Person] {
    override def compare(x: Person, y: Person) = if (x.age > y.age) 1 else -1
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Person("Huxz", 38)
    val p2 = new Person("Liucy", 28)
    val tools = new CompareUtils[Person](p1,p2)
    println(tools.result)
  }
}

class Person(var name: String, var age: Int) {
  override def toString: String = name + "\t" + age
}

//声明比较工具类
class CompareUtils[T: Ordering](first: T, second: T) {
  def result = {
    //获取隐式值
    val ordering = implicitly[Ordering[T]]
    ordering.compare(first, second)
  }
}