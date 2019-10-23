package classes

import scala.beans.BeanProperty

/**
  * 被@BeanBeanProperty修饰的成员变量会自动生成java和scala风格的getter和setter
  */
class Fish {
  @BeanProperty var kind: String = ""
}

object FishDemo{
  def main(args:Array[String]):Unit={
    val fish1 = new Fish
    fish1.kind="鲫鱼"
    println(fish1.kind)
    val fish2 = new Fish
    fish2.setKind("金鱼")
    println(fish2.getKind)
  }
}
