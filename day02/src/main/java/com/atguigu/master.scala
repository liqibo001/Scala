package com.atguigu

object master {
  def main(args: Array[String]): Unit = {
val name ="zhangsan"
    println(
      s"""
         |hello
         |${name}
         |""".stripMargin)
  }

  private val i: Int = scala.io.StdIn.readInt()
  println(i)

  scala.io.Source.fromFile("input/word.txt").foreach(line=>println(line))
}
