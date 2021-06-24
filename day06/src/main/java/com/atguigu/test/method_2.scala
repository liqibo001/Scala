package com.atguigu.test

object method_2 {
  def main(args: Array[String]): Unit = {
    //集合常用方法
    val list1 = List(1,2,3,4)
    val list2 = List(3,4,5,6)


    println(list1.intersect(list2)) //交集 List(3, 4)
    println(list1.union(list2)) //并集   List(1, 2, 3, 4, 3, 4, 5, 6)
    println(list1.diff(list2))   //差集 List(1, 2)

    //按照顺序来匹配数据：拉链
    println(list1.zip(list2)) // 拉链 List((1,3), (2,4), (3,5), (4,6))

    //将集合的一部分数据当成整体来用
    //获取集合中连续二条数据的和
    val iterator: Iterator[List[Int]] = list1.sliding(2,1)  //滑动窗口   可以增加步长 默认值是1
    while (iterator.hasNext){
      println(iterator.next())             // List(1, 2) List(2, 3)  List(3, 4)
    }

  }
}
