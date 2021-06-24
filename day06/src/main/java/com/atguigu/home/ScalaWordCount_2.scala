package com.atguigu.home

import scala.io.{BufferedSource, Source}

object ScalaWordCount_2 {
  def main(args: Array[String]): Unit = {
        //读取数据文件
    val in: BufferedSource = Source.fromFile("./input/word.txt")
    val lineList: List[String] = in.getLines().toList
    in.close()
        //将读取的每一行字符串拆分成一个个的单词
    val words: List[String] = lineList.flatMap(_.split(" "))
      // 将相同的单词分在一个组中
    val wordToListMap: Map[String, List[String]] = words.groupBy(word=>word)

    println(wordToListMap)
//将相同的单词统计出现的数量
    val wordToCountMap: Map[String, Int] = wordToListMap.map(t => {
      val k: String = t._1
      val v: List[String] = t._2
      (k, v.size)
    })

    // 降序排序 取前三
    println(wordToCountMap.toList.sortBy(_._2)(Ordering.Int.reverse).take(3))

  }

}
