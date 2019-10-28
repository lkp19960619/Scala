package patternmatch

/**
  * 模式匹配中的类型匹配
  * 对表达式的类型进行匹配，Scala推荐使用这样的方式进行类型匹配，而不是使用isInstanceOf操作符
  */
object Pattern4 {
  def main(args: Array[String]): Unit = {
//    val t1 = new Person
    val t1 = new Student
//    val t1 = new Worker
    t1 match {

      case y: Student => println("Student")
      case z: Worker => println("Worker")
      case x: Person => println("Person")
      case _ => println("other works")
    }
  }
}

class Person

class Student extends Person

class Worker extends Person
