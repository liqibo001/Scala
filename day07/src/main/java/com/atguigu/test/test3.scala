package com.atguigu.test

import scala.io.{BufferedSource, Source}

object test3 {
  def main(args: Array[String]): Unit = {
    val in: BufferedSource = Source.fromFile("./input/word.txt")
    val line : List[String] = in.getLines().toList   //List(Hello Scala, Hello Spark, Hello Hadoop)
    in.close()

    val wordList: List[String] = line.flatMap(t => {
      t.split(" ")
    })

    val mapWordList: Map[String, List[String]] = wordList.groupBy(word=>word)
    val wordMap: Map[String, Int] = mapWordList.mapValues(_.size)
    val tuples: List[(String, Int)] = wordMap.toList.sortBy(_._2)(Ordering.Int.reverse)
    println(tuples)
    println(wordMap)


    println(mapWordList)
    println(wordList)
    println(line)
  }
}
