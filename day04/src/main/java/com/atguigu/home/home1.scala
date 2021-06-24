package com.atguigu.home

object home1 {
  def main(args: Array[String]): Unit = {

    /*  TODO  scala 中方法名如果和类名相同 并不是构造方法  就是普通方法
            scala 万物皆对象 万物皆函数
            类 也是函数 在类名后面增加参数列表 其实就是构造函数
            //scala 种构造方法分为2大类 主构造方法（类的初始化） 辅助构造方法（辅助）
            类名后的构造方法就是主构造方法
            辅助构造方法 主要使用this 关键字
            辅助构造方法在执行时 必须显示调用(直接 ,间接)主构造方法 完成类的初始化
            辅助构造方法存在重载概念

    */

    val user = new User(20)
  }


  class User(name: String) {
    println(name)

    def this() {
      this("zhangsan")
    }

    def this(i:Int) {
      this()
    }

  }

}
