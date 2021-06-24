package com.atguigu.demo

object Demo4 {
  def main(args: Array[String]): Unit = {
    //匹配常量
/*    def describe(x: Any) = x match {
      case 5 => "Int five"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
    }

    println(describe(true))*/

    //匹配类型  模式匹配中的类型匹配是不考虑泛型的
    //java 中的数值是没有泛型的概念
    // scala 中的Array的泛型是特殊的 可以理解为Array[Int]是一个整体

/*
    def describe(x: Any) = x match {
      case i: Int => "Int"
      case s: String => "String hello"
      case m: List[Int] => "List"
      case c: Array[Int] => "Array[Int]"
      case someThing => "something else " + someThing
    }

    println(describe(List(1, 2, 3)))  //List
    println(describe(List("1", "2", "3")))  //List
    println(describe(Array(1, 2, 3)))  //Array[Int]
    println(describe(Array("1", "2", "3")))  //something else [Ljava.lang.String;@4cdbe50f
*/

/*
    // 匹配数组
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) { // 对一个数组集合进行遍历
      val result = arr match {
        case Array(0) => "0" //匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
        case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
        case _ => "something else"
      }
      println("result = " + result)
    }
*/


    //匹配列表

    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))) {
      val result = list match {
        case List(0) => "0" //匹配List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的List
        case List(0, _*) => "0 ..."
        case _ => "something else"
      }

      println(result)
    }
    val list: List[Int] = List(1, 2, 5, 6, 7)

  }

}
