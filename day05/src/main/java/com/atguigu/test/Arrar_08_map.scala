package com.atguigu.test

import scala.collection.mutable

object Arrar_08_map {
  def main(args: Array[String]): Unit = {
 /*   val map: mutable.Map[String, Int] = mutable.Map(("a",1),("b",2))
    map.get("a")
    val list: List[(String, Int)] = map.toList //有序 元组 但是是一个整体  没有根据K 得到V 的功能
      val iterator: Iterator[String] = map.keys.iterator*/
 val result1 = (0 to 100).map{x => Thread.currentThread.getName}
    val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}  //并行

    println(result1)
    println(result2)

  }

}
