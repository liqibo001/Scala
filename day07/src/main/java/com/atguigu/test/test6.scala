package com.atguigu.test

object test6 {
  def main(args: Array[String]): Unit = {


//    val result: List[Any] = list1.map(t => {
//      t match {
//        case int: Int => int + 1
//        case b => b
//      }
//    }).filter(_.isInstanceOf[Int])

    implicit  def  aa (d:Double):Int={
      d.asInstanceOf[Int]
    }

    //val a:Any = 1
    //val int1: Int = a.toInt

    val list1= List(5, 2, 3, 4, 5, 6, "aa")
//    val result: List[Any] = list1.filter(_.isInstanceOf[Int]).map(t => {
//      t match {
//        case int: Int => int + 1
//        case b => b
//      }
//    })
//
//
//    val ints: List[Any] = result.map(_.isInstanceOf[Int]).sortBy(a=>a)
//    println(ints)

    val ints: List[Int] = list1.collect{case x : Int =>x+1}.sortBy(num=>num)
    println(ints)



  }
}
