package com.atguigu.home

import scala.collection.immutable.StringOps
import scala.collection.mutable.ArrayOps

object Demo2 {
  def main(args: Array[String]): Unit = {
    val list = List(("Hello Spark Scala", 4),("Hello Spark", 3),("Hello Spark", 3))


    val wordCountList: List[(String, Int)] = list.flatMap(t => {
      val line = t._1
      val V: Int = t._2
      val words: ArrayOps.ofRef[String] = line.split(" ")
      words.map(word => {
        (word, V)
      })

    })
    println(wordCountList.mkString(","))  //(Hello,4),(Spark,4),(Scala,4),(Hello,3),(Spark,3),(Hello,3),(Spark,3)

    val groupMap: Map[String, List[(String, Int)]] = wordCountList.groupBy(_._1)

    val stringToInt: Map[String, Int] = groupMap.map(t => {
      {
        val K: String = t._1
        val V: List[(String, Int)] = t._2
        (K, V.map(_._2).sum)
      }
    })
    println(stringToInt)

  }

}
