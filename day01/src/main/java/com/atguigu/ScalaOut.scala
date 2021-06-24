package com.atguigu

import java.io.{File, PrintWriter}

object ScalaOut {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("output/word.txt"))
    writer.write("aaa")
    writer.close()
    var name :String ="aaa"
    var userName="wqw"
    printf(s"name=${name}")
  }
}
