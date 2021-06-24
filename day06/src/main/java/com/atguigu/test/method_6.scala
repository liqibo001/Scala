package com.atguigu.test

import scala.collection.mutable

object method_6 {
  def main(args: Array[String]): Unit = {

    val map1: mutable.Map[String, Int] = mutable.Map(("a",1),("b",2))
    val map2: mutable.Map[String, Int] = mutable.Map(("a",3),("c",4))

    //以map1为基准 map2就是初始值
    val newmap: mutable.Map[String, Int] = map1.foldLeft(map2)((map, kv) => {
      val k: String = kv._1
      val v: Int = kv._2
      val newValue: Int = map.getOrElse(k, 0) + v
      map.update(k, newValue)
      map
    })
    newmap
    println(newmap)
  }
}
