package com.atguigu.test

import scala.beans.BeanProperty

object test1 {
  def main(args: Array[String]): Unit = {
    //scala 中import 操作使用相对路径 以当前包为查找的基准路径

    //如果属性声明为私有的 那么编译器 在编译的时候提供私有的 set get 方法

    //动态绑定机制:当调用一个对象的成员方法时，JVM会将这个方法和对象的实际内存进行绑定 然后调用 ，属性没有动态绑定机制  编译看左边 执行看右边
  }
//  Object
  @BeanProperty
  class User{
    var name :String="lisi"
    val password :String="1111"

    override def clone(): AnyRef = super.clone()
  }
}
