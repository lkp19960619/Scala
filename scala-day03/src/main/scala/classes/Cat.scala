package classes

/**
  * scala会默认提供一个无参的主构造器,除此之外，scala还可以自定义辅助构造器，但是辅助构造器的名称
  * 必须是this，并且每一个辅助构造器必须以一个对先前已定义的其它辅助构造器或主构造器的调用开始
  */
class Cat {
  var kind: String = ""
  var sex: Boolean = false

  //辅助构造器 1
  def this(kind: String) {
    this()
    this.kind = kind
  }

  //辅助构造器 2
  def this(kind:String,sex: Boolean) {
    this(kind)
    this.sex = sex
  }
}

object CatDemo{
  def main(args: Array[String]): Unit = {
    val cat1 = new Cat()
    val cat2 = new Cat("波斯猫")
    val cat3 = new Cat("加菲猫",true)
    println(cat2.kind)
    println(cat3.kind+"\t"+cat3.sex)
  }
}
