package com.atguig.test

import scala.util.control.Breaks._

object test2 {
  def main(args: Array[String]): Unit = {
    breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          break()
        }
        println(i)
      }
    }
    println("weeqw")


    //将复杂的参数简单化 声明多个参数列表
    def test1(i: Int)(j: Int): Unit = {

    }

    def test3(num: Int):Long = {
      if (num <= 1) {
        1
      } else {
        num * test3(num - 1)
      }
    }

    println(test3(20))


    def test4(): Unit ={
      println("xxxx")
      test4()
    }
    test4()



    //函数到底是什么
    //1. 函数  编译时 编译为private static  final 方法  方法名和函数名不一致 增加后缀
    //2.方法 编译时 会编译为JAVA 中的成员方法
    def test6(): Unit ={
      println("test6...")
    }
  }
}
