package com.atguigu.test

object method_7 {
  def main(args: Array[String]): Unit = {
    //功能函数
    //为了实现某些特殊功能所停供的函数
    //    所谓的功能方法 其实就是scala 停供API 让开发人员可以自己提供实现方法对集合  具体的实现由scala完成

    //  TODO  map=>映射，转换 , A->B
    val list1 = List(1, 2, 3, 4)   //----> 2 ,4,6,8    里面所有的数据 * 2
    println(list1.map(_ * 2))  // List(2, 4, 6, 8)   //foreach 没有返回值 map 方法有返回值

    val list2 = List("hello","spark","scala")
    println(list2.map(_.substring(0, 1).toUpperCase)) //List(H, S, S)

  }

}
