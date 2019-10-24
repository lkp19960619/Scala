package com.baizhi.functions

object Function02 {
  def main(args: Array[String]): Unit = {
    //声明匿名函数
    val f1 = (x: Int, y: Int) => x + y
    val result = sum(1, 2, f1)
    println(result)
  }

  def sum(x: Int, y: Int, f: (Int, Int) => Int) = {
    x + y
  }
}
