package classes

class Employee {
  //成员必须初始化
  var age: Int = 0
  var name: String = ""

  //成员方法
  def sayHello: String = {
    s"Hello:$name,I am $age years old."
  }
}

object EmployeeDemo {
  def main(args: Array[String]): Unit = {
    //创建对象
    val employee = new Employee()
    employee.name="zhangsan"
    employee.age = 24
    val employee1 = new Employee
    employee1.name="lisi"
    employee1.age=25
    //输出的是对象的地址
    println(employee)
    println(employee1)
    println(employee.sayHello)
  }
}
