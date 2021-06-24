package com.atguigu.test

// 先统计  在分组
object test1 {
  def main(args: Array[String]): Unit = {
/*    val a: Int = 10
    val b: Int = 20
    val operator: Char = 'b'
    val result: Any = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"  //如果所有case 都匹配 那么会执行case _  如果不存在 case _ 那么会发生错误
    }
//    println(result)*/

//匹配常量
/*    def describe(x:Any) =x match {
      case 5 => "int five"
      case "hello" => "string hello"
      case  true => "Boolean true"
      case '+' => "char +"
      case _ => "illegal"
    }

    println(describe(a))*/

    def describe (x :Any) = x match {
      case int: Int => "int"
      case string: String=>"string"
      case list: List[Int] => "list"
      case array: Array[Int] => "array[int]"
      case something :Any=> "something else"

    }
    println(describe(List(1, 2, 3)))  //List
    println(describe(List("1", "2", "3")))  //List
    println(describe(Array(1, 2, 3)))  //Array[Int]
    println(describe(Array("1", "2", "3")))  //something else [Ljava.lang.String;@4cdbe50f

  }
}
