package com.atguigu.test

import java.util

object test2 {
  def main(args: Array[String]): Unit = {
    //构造：scala 中方法名如果和类名相同 并不是构造方法 就是普通方法
    //类也是函数 在类名后增加参数列表 其实就是构造函数
    new User()
    new parent()
  }


 class  parent  (name: String) {
    println("11111")
    def this() {
      this("ZZZZZ")
      println("2222222")
    }
  }

  class User  (name: String) extends parent() {
    def this() {
      this("yyyy")
      println("33333")
    }
    println("44444")
  }

}
