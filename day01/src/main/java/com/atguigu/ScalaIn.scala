package com.atguigu

import scala.io.{BufferedSource, Source}

object ScalaIn {
  def main(args: Array[String]): Unit = {
    val source: BufferedSource = Source.fromFile("input/word.txt")
    val strings: Iterator[String] = source.getLines()
    while (strings.hasNext){
      println(strings.next())
    }
    source.close()
  }
}
