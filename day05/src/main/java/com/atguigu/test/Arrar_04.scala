package com.atguigu.test

import scala.collection.mutable

object Arrar_04 {
  def main(args: Array[String]): Unit = {
    //--映射 Map
    //map 集合中存储的是键值对数据：K-V
    //无序 key不能重复 但是V可以重复
    //默认情况下 scala 提供的map集合也是不可变
    //键值对 K -> V
    val map: Map[String, Int] = Map("a" ->1,"b"->2,"c"->3)

   //可变map集合
    val map1: mutable.Map[String, Int] = mutable.Map("a" ->1,"b"->2,"c"->3)

    map1.put("d",5) //
    map1.get("c")
    map1.update("d",6)
    map1.remove("d")
    map1.mkString(",")
    map1.foreach(println(_))

    println(map)


  }

}
