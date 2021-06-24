package com.atguigu.home
object home3 {
  def main(args: Array[String]): Unit = {
val user = new User()

  }
trait T1{
  println("333")
}
  trait T2{
    println("444")
  }
  trait T3{
    println("555")                        // 答案 333  111 444 222
  }
  class Parent extends T1{
    println("111")
  }
  class User extends Parent with T2{
    println("222")
  }
}
