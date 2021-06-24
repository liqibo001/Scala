package com.atguigu.test

import scala.collection.mutable

object Arrar_07_Queue {
  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[String]()
    // 添加元素
    que.enqueue("a", "b", "c")
    val que1: mutable.Queue[String] = que += "d"
    println(que eq que1)
    // 获取元素
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())

  }

}
