package com.atguigu.chapter05

object function_Hell {
  def main(args: Array[String]): Unit = {
    //scala 是万物皆对象 所以函数也是对象
    def fun1(): Unit = {
      println("zhangsan")
    }

    //将函数最为对象赋值给变量，这个变量其实就是函数
    //函数有类型，类型的名字就叫做Function
    //函数类型在Scala 中默认识别为22个 参数
    //    val f1:Function0[Unit] = fun1
    val f1: () => Unit = fun1

    f1()


    def fun2(i: Int): Int = {
      //      println(i)
      i * 2
    }

    val f2: (Int) => Int = fun2
    println(f2(10))

    def fun3(): Unit = {
      println("fun3.....")
    }
   val f3 =fun3 _
    f3()

    val f5:()=>Unit =fun3
    f5()
  }
}
