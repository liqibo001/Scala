package com.atguigu.test

import scala.collection.mutable
import scala.collection.mutable.ListBuffer


object Arrar_03 {
  def main(args: Array[String]): Unit = {
    //集合-序列
    //可变list集合
    val buffer: ListBuffer[Int] = ListBuffer(1,2,3,4)
    buffer.append(5,6,6)
    println()
    //无序不可重复
    val ints: Set[Int] = Set(1,2,3,4,5,6,7,8)
    println(ints)  //Set(5, 1, 6, 2, 7, 3, 8, 4)
    //可变set集合
    val set: mutable.Set[Int] = mutable.Set(1,2,3,4,5)
    //添加数据
    set.add(9)
    //修改set集合本身
//    set.
    set.update(3,true)
    set.remove(2)
    set.mkString(",")
    set.foreach(println)
    set += 5  //原集合
    set + 5   //产生新的集合
  }
}
