package com.atguigu.Demo

object Demo4 {
  def main(args: Array[String]): Unit = {
    //scala 中的泛型和java中的泛型很像
    //scala 中的泛型采用的是中括号声明
    //scala 中的泛型不可变
    //将类型和泛型当成一个整体来使用
    //当成整体后 如果泛型为子类型也可以代替父类型
    // 泛型的协变：泛型前增加 ： +
    // 泛型的逆变=> 泛型前增加：-


    //泛型的上限 和下限
    //scala 中的泛型的上限和下限采用采用颜文字
    // 上限 _ <: T
    // 下限 _ >：T
  }

}
