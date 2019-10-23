package classes

class Dog {
  var defaultColor: String = "black"
  //属性名和方法名不能相同
//  def color():String=defaultColor
  //scala的get方法
  def color=defaultColor
  //scala的set方法
  def color_(color:String):Unit={
    defaultColor = color
  }
}

object DogDemo{
  def main(args:Array[String]):Unit={
    val dog1 = new Dog
    dog1.color_("red")
    println(dog1.color)
  }
}