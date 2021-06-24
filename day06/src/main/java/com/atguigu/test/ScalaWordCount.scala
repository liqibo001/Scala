package com.atguigu.test

import scala.io.{BufferedSource, Source}

object ScalaWordCount {
  def main(args: Array[String]): Unit = {
    //TODO WordCount
    // 经典  统计单词出现的次数和频率   分析---> 设计 --->开发
    //todo 1  读取数据 line
    val in: BufferedSource = Source.fromFile("./input/word.txt")
    val lineList: List[String] = in.getLines().toList
    in.close()
    //todo 2 将读取的每一行字符串拆分成一个一个的单词  line->Word

    val words: List[String] = lineList.flatMap(_.split(" "))
    //todo 3 将相同的单词分组一个组中  map(word ->list[word,word,word])
    val wordToListMap: Map[String, List[String]] = words.groupBy(word =>word)

    //这里不要使用下划线代替

    //todo 4 将相同的单词统计出现的数量 list(word,word,word)->3  map(word->3)

    val wordToCountMap: Map[String, Int] = wordToListMap.map(t => {
      val word: String = t._1
      val list = t._2
      (word, list.size)
    })
    println(wordToCountMap)
    //todo 5将统计的结果进行排序(降序)
    val sortList: List[(String, Int)] = wordToCountMap.toList.sortBy(_._2)(Ordering.Int.reverse)

    //todo 6 将结果取前3名（top）
    println(sortList.take(3))


  }

}
