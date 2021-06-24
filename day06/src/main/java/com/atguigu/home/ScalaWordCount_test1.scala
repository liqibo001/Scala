package com.atguigu.home

import scala.io.{BufferedSource, Source}

object ScalaWordCount_test1 {
  def main(args: Array[String]): Unit = {
    val in  : BufferedSource = Source.fromFile("./input/word.txt")
    val lineToList: List[String] = in.getLines().toList
    in.close()

    val words: List[String] = lineToList.flatMap(_.split(" ")) //List(Hello, Scala, Hello, Spark, Hello, Hadoop)

    val wordToListMap: Map[String, List[String]] = words.groupBy(word=>word)

    val wordToCountMap: Map[String, Int] = wordToListMap.map(t => {
      (t._1, t._2.size)
    })

    println(wordToCountMap.toList.sortBy(_._2)(Ordering.Int.reverse).take(3))
    println(wordToCountMap)


    println(words)
  }
}
