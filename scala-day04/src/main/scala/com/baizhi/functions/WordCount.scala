package com.baizhi.functions

/**
  * 功能需求：使用scala的高阶函数完成单词技术
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val a = Array("Hello Scala", "Hello Kafka", "Hello Hadoop", "Hello Hello")

    //x=>x.split(" ")
    a
      .flatMap(_.split(" ")) //把短语拆分成单词
      .map((x: String) => (x, 1)) // 元组 Tuple
      .groupBy((t: (String, Int)) => t._1) //根据元组分组，t._1表示取元组的第一个位置的数值
      .map(t => (t._1, t._2.length))
      .foreach(println)

    //简化写法
    a.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t => (t._1, t._2.length)).foreach(println)
  }

}
