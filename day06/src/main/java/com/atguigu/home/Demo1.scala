package com.atguigu.home

import scala.io.{BufferedSource, Source}

object Demo1 {
  def main(args: Array[String]): Unit = {

    val in: BufferedSource = Source.fromFile("./input/word.txt")
    val lineList: List[String] = in.getLines().toList
    in.close()
    
    val words: List[String] = lineList.flatMap(_.split(" "))

     val wordToListMap: Map[String, List[String]] = words.groupBy(word=>word)
//    println(wordToListMap)
    val wordToCount: Map[String, Int] = wordToListMap.map(t => {
      val K: String = t._1
      val V: List[String] = t._2
      (K, V.size)
    })


    val sortList: List[(String, Int)] = wordToCount.toList.sortBy(_._2)(Ordering.Int.reverse)

    val listTake: List[(String, Int)] = sortList.take(3)
    println(listTake.mkString(","))

//    println(wordToCount.mkString(","))


  }

}
