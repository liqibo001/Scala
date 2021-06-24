package com.atguigu.Demo

import scala.util.matching.Regex

object Demo5 {
  def main(args: Array[String]): Unit = {
    //match：模式匹配 用于匹配数据的规则
    //正则表达式只用于匹配字符串
    // TODO  声明正则表达式
    val r: Regex = "s".r   //字符串中有没有包含的指定字符串
    // TODO 匹配字符串
    val maybeString: Option[String] = r.findFirstIn("hello")
    if (maybeString.isEmpty){
      println("meiyou")
    }else{
      println(maybeString.get)
    }
    maybeString
//    r.findAllIn()
  }

}
