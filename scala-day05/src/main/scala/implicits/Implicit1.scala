package implicits

class Student(var name: String)

object Implicit1 {
  def main(args: Array[String]): Unit = {
    //传入的类型和方法的参数类型不匹配，触发隐式转换，str->student
    sayHi("zhangsan")
  }
  implicit def str2Student(str:String):Student={
    new Student(str)
  }
  //定义一个普通方法，传入一个对象类型参数
  def sayHi(student: Student)={
    println("Hello:"+student.name)
  }
}
