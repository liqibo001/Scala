package com.atguigu.test

object method_4 {
  def main(args: Array[String]): Unit = {

    val list1 = List(1,2,3,4,5)

    //折叠 :函数的柯里化
    // z => zero => 零 => 零值 => 初始值
    //fold 方法存在两个参数列表
    //第一个参数列表中的参数表示计算的初始值
    //第二个参数列表中的参数表示两两计算的逻辑

    println(list1.fold(6)(_ + _))  //21
    println(list1.fold(6)(_ - _))  //-9
    // fold 方法底层实现其实就是foldLeft

    // reversed.foldLeft(z)((x, y) => op(y, x))
    println(list1.foldRight(6)(_ + _))
  }
}
