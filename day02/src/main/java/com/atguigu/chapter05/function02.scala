package com.atguigu.chapter05

object function02 {
  def main(args: Array[String]): Unit = {

    def fun1(): String = {
      return "zhangsan"
    }


    //函数可以自动将最后一行代码的结果作为函数的返回值
    //return 关键字可以省略
    def fun2(): String = {
      "zhangsan"
    }


    //如果返回值能确定，那么返回值类型其实也是可以确定的，那么返回值类型 也就可以省略
    def fun3() = {
      "zhangsan"
    }

    //如果函数逻辑代码只有一行 那么花括号也可以省略
    def fun4() = "zhangsan"

    //如果参数列表没有参数 那么小括号可以省略
    def fun5 = "zhangsan"


    //如果函数明确没有返回值，那么函数体中的return关键字不起作用
    //      如果函数体中存在return关键字 那么返回值类型不能省略
    //    不想声明返回值类型 但是又不想return关键字起作用 此时可以连同返回值类型和等号一起省略
    //    没有等号 就是默认没有返回值  称之为过程函数
    def fun6() {
      return "lisi"
    }

    //如果不关心函数的名称 只关心逻辑的时候 函数名和def可以省略

    def fun7(): Unit = {
      println("fun7...")
    }

    //匿名函数 注意增加>   无法直接调用 需要赋值给其它的变量来调用
//    () => {
//      println("fun7777...")
//    }

      val f = () => {
        println("fun7777...")
      }

      f()


      //如果函数声明时省略了参数列表，那么调用时也不能加参数列表
      val name = fun6
      println(name)


  }
}
