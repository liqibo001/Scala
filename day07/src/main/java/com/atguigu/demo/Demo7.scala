package com.atguigu.demo

object Demo7 {
  def main(args: Array[String]): Unit = {
    //偏函数  （满足条件的数据处理的函数）
val list = List(1,2,3,4,5,"test")

    val result: List[Int] = list.collect{case i:Int => i+1}
    println(result)
    //

  }
}
