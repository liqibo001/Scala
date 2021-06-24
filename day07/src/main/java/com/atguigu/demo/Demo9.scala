package com.atguigu.demo

object Demo9 {
  def main(args: Array[String]): Unit = {
    //程序已经编译出现错误 编译器会尝试在指定范围内查找转换规则
    //Double => int 自动应用这个规则 让错误的程序可以编译通过  将这个操作称之为二次编译 这个转换是由编译器自动完成的 所以称之为隐式转换
    //TODO 隐式转换

    //所谓的隐式转换 其实就是通过类型的转换实现编译操作
    //如果

//使用implicit 关键字修饰的函数 称之为隐式函数 可以被编译器在编译时使用
    implicit  def transform(d :Double):Int={
      d.toInt
    }
    implicit  def transform2(d :Double):String={
      d.toString()
    }

  }
}
