package objects

/**
  * 单例对象
  */
object IdFactory {
  //被object修饰的类是一个单例对象
  private var id: Int = 0

  def increment(): Int = {
    id += 1
    id
  }

  def main(args: Array[String]): Unit = {
    println(IdFactory.increment())
    println(IdFactory.increment())
    println(IdFactory==IdFactory)

  }
}
