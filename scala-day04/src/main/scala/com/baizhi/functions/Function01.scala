package com.baizhi.functions

object Function01 {
  def main(args: Array[String]): Unit = {
    //1、将函数作为值去使用,当前的赋值变量是一个对象
    val s = sum _// _匹配参数列表
    println(s)
  }
  //声明一个函数
  def sum(x:Int,y:Int)=x+y
}
