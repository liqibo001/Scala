package com.atguigu.test

object test5 {
  def main(args: Array[String]): Unit = {
//    def describe(x:Any)= x match {
//      case 5=>"int five"
//      case i :Int => "is int"
//      case s :String=>"string hello"
//      case list: List[_]=>"List"
//      case "hello"=> "string"
//      case true =>"boolean true"
//      case _ => "some eles"
//    }
//
//    println(describe(10))


    def describe(x:Any):Any=x match {
      case int: Int=>"int"
      case string: String=>"string"
      case list: List[_] =>"list"
      case c :Array[Int] =>"array"
      case s=> "something"

    }

    println(describe(true))
    println(describe(Array(1, 2, 3, 4)))
    println(describe(Array("a", "b", "c")))


/*    for (arr<- Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0))){
      val result: String = arr match {
        case Array(0) => "0"
        case Array(x, y) => "有两个元素"
        case Array(0,_*)=>"aaa"
        case Array(_*)=> "bbb"
        case _ => "else"
      }
      println(result)
    }*/

/*    for (tuple <- Array((0, 1),(0, 1,1), (1, 0),(1,1, 0), (1, 1), (1, 0, 2))){
      val result = tuple match {
        case (0, _) => "是第一个元素是0 的元组"
        case (_,0)=>"两个元素 最后一个是零的元组"
        case _ => "else"
      }
      println(result)
    }*/

    val user1 = new User()
    val user2 = new User()

    user1 match {
      case User("zhangsan",30) =>println("张三用户")
      case _ =>println("其它用户")
    }

  }
  case class User (val name:String="zhangsan",val age:Int=30)
}
