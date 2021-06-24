package com.atguigu.chapter05

object function_Hell_1 {
  def main(args: Array[String]): Unit = {
    //  将函数作为参数来使用
    /*    def test(): Unit ={
          println("test.....")
        }
        def fun1(f: () => Unit): Unit = {
          f()
        }
        val f:()=>Unit = test
        fun1(f)*/

    def fun(f: (Int, Int) => Int)= {
      f(10, 20)
    }

//    def test(i: Int, j: Int): Int = {
//      i * j
//    }
//
//    def test1(i: Int, j: Int): Int = {
//      i + j
//    }

    //TODO 将函数作为参数来使用 一般情况下使用匿名函数
    val i1: Int = fun((i:Int,j:Int)=>{i+j})
    println(i1)


// val i: Int = fun(test1)
//    println(i)


  }
}
