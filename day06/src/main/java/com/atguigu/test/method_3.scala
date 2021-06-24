package com.atguigu.test

object method_3 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4)

    println(list1.sum) //求和  10
    println(list1.max) //最大值  4
    println(list1.min) //最小值  1
    println(list1.distinct)//去重  List(1, 2, 3, 4)
    println(list1.product)//乘积  24

    //scala 提供了自定义计算的函数
    //reduce :聚合功能（简化,规约）
    // scala 中数据计算的方法用的最多的是 ：两两计算
    //（A1,A1）=> A1
    println(list1.reduce(_ - _))    //-8
    //reduce 方法底层实现 就是reduceLeft  是reduceLeft的特例
    //(B，Int) => B
    println(list1.reduceLeft(_ - _))

    println(list1.reduceRight(_ - _))
    //reduceLeft : (((1 -2)- 3) -4)
    //reduceRight :  (1 -(2 -(3- 4)))
  }
}
