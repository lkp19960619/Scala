package objects

/**
  * 当类名和单例类名字一样的时候，我们把单例类成为伴生对象
  */
object Person {
  private var id: Int = 0

  def getPersonNum(): Int = {
    id += 1
    id
  }

  def main(args: Array[String]): Unit = {
    //伴生类new出来的对象
    val p1 = new Person
    val p2 = new Person
    //伴生对象是一个单例对象
    val p3 = Person
    val p4 = Person
    println(p1 == p2)
    println(p3 == p4)
    println(p1.id)
    println(p2.id)
  }
}

class Person {
  //在伴生类中可以调用伴生对象的私有方法
  private var id: Int = Person.getPersonNum()
  private var address: String = ""
}