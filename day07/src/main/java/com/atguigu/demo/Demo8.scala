package com.atguigu.demo

import java.io.FileInputStream

object Demo8 {
  def main(args: Array[String]): Unit = {
    //TODO scala 异常不分类
    //scala 中没有throws 关键字
    //scala 中异常处理类似模式匹配   如果异常类型没有匹配成功 也不会发生MatchError 只是将异常直接抛给JVM
//    throw new Exception()
//    throw new RuntimeException()

    //启动类 应用类 扩展类 加载器
    try{
      val i = 0
      val j = 10/i
//      new FileInputStream("xxxx")
    }catch {
      case e :ArithmeticException => println("算数异常")
      case e : Exception => println("其它异常")
    }
  }

}
