package inherit

class Animals {
  var name: String = ""
}

class Bear extends Animals {
  def run = s"$name,在愉快的奔跑！"
}

object Bear {
  def main(args: Array[String]): Unit = {
    val bear = new Bear
    bear.name = "北极熊"
    println(bear.run)
  }
}
