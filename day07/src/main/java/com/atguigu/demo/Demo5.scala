package com.atguigu.demo

object Demo5 {
  def main(args: Array[String]): Unit = {
    //TODO 模式匹配-应用场景
    val t = (1,"zhangsan",30)
    val (id,name,age) = (1,"zhangsan",30)
    println(id)
    println(name)
    println(age)

    val map: Map[String, Int] = Map(("a",1),("b",2),("c",3))
    for ((k,v) <- map) {
      println(k+"="+v)
    }
    for (elem <- map) {
      println(elem._1+"="+elem._2)
    }
  }

}
