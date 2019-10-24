package com.baizhi.exception

import java.io.IOException

/**
  * scala异常分类和java一致
  *   Throwable
  *     -Error
  *     -Exception
  *       -未检查异常
  *       -已检查异常
  * 异常的处理方式：
  * -消极处理：throw 异常类 没有throws
  * -积极处理：try{...}catch{...}finally{...}
  */
object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    //消极处理异常的方式
    //    throw new RuntimeException("程序终止")

    //积极处理异常的方式
    try {
      println("start")
//      throw new RuntimeException("程序终止")
      throw new IOException("")
      println("end")
    } catch {
      case e1: RuntimeException => println("runtime exception")
      case e2: Exception => println("exception")
    } finally {
      println("释放资源")
    }
  }
}
