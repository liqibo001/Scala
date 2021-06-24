package com.atguigu.test

object Arrar_07_Tuple {
  def main(args: Array[String]): Unit = {
    //如果元组中只有两个元素 那么这样的元组称之为对偶元组 也称之为键值对
//    val kv =("a",1)
    //map 集合中的键值对 其实就是元组  "a" ->1

/*    val map: Map[String, Int] = Map(("a",1),("b",2))

    for (elem <- map) {
      println(elem._1+","+elem._2)
    }*/
    val tuple: (Int, String, Int) = (1,"zhangsan",30)

  }

}
