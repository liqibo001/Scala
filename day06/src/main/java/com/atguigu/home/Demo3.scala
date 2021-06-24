package com.atguigu.home

import scala.collection.immutable.StringOps
import scala.collection.mutable.ArrayOps

object Demo3 {
  def main(args: Array[String]): Unit = {

    val list = List(("Hello Spark Scala", 4),("Hello Spark", 3),("Hello Spark", 3))

    val wordToCnList: List[(String, Int)] = list.flatMap(t => {
      val line: StringOps = t._1
      val count: Int = t._2
      val words: ArrayOps.ofRef[String] = line.split(" ")
      words.map(word => {
        {
          (word, count)
        }
      })
    })
//    println(wordToCnList.mkString(","))   //(Hello,4),(Spark,4),(Scala,4),(Hello,3),(Spark,3),(Hello,3),(Spark,3)

    val groupMap: Map[String, List[(String, Int)]] = wordToCnList.groupBy(_._1)

//    println(groupMap.mkString(","))  //Hello -> List((Hello,4), (Hello,3), (Hello,3)),Spark -> List((Spark,4), (Spark,3), (Spark,3)),Scala -> List((Scala,4))

    val stringToInt: Map[String, Int] = groupMap.map(t => {
      val word: String = t._1
      val value: List[(String, Int)] = t._2
      (word, value.map(_._2).sum)
    })
    println(stringToInt.toList.sortBy(_._2)(Ordering.Int.reverse).mkString(","))
  }

}
