package com.atguig.test

import scala.util.control.Breaks._
//import scala.util.control.Breaks.break


//object test3 {
//  def main(args: Array[String]): Unit = {
//    def oper(x: Int) = {
//      def middle(y: Int) = {
//        def inner(f: (Int, Int) => Int) {
//          f(x, y)
//        }
//        inner _
//      }
//      middle _
//    }
//  }
//}


//object test3 {
//  def main(args: Array[String]): Unit = {
//    //如果将函数返回 那么一般省略返回值类型 应用自动推断
//    def outer() = {
//      def inner(): Unit = {
//        println("zhangsan")
//      }
//
//      inner _
//    }
//    outer()()
//  }
//}

//object test3 {
//  def main(args: Array[String]): Unit = {
//    def oper(x: Int) = {
//      def middle(y: Int) = {
//        def middle2(z: Int)= {
//          def inner(f: (Int, Int,Int) => Int) = {
//            f(x, y,z)
//          }
//
//          inner _
//        }
//        middle2 _
//      }
//      middle _
//    }
//
//    println(oper(10)(10)(10)(_ * _+_))
//  }
//}

//object test3 {
//  def main(args: Array[String]): Unit = {
//    breakable{
//      for (i <- 1 to 5){
//        if (i==3){
//         return
//        }
//        println("xx")
//      }
//    }
//  }
//}

object test3 {
  def main(args: Array[String]): Unit = {
    //    for (i <- 1 to 5; j <- Range(1,5,2)){
    //      println(i,j)
    //    }
    //
    //    def fun4(x:Int):Int={
    //      return x*20
    //    }

    def fun5(f: => Unit):Unit = {
      f
    }

//    fun5(println("aaa"))

    def aaa ():Unit = println("jjjjj")


    fun5{
      val function = aaa _
      function()
    }
    //aaa(3)
  }
}