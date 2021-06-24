package com.atguigu.test

object method_5 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5)
    // scan 参数 和fold参数是一样
    // scan 方法会保留所有的计算过程的数据
    println(list1.fold(0)(_ + _))  //15
    println(list1.scan(0)(_ + _)) //List(0, 1, 3, 6, 10, 15)

    println(list1.foldRight(0)(_ - _)) // 3
    println(list1.scanRight(0)(_ - _)) //List(3, -2, 4, -1, 5, 0)


  }
}
