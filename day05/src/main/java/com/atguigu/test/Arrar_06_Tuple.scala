package com.atguigu.test

object Arrar_06_Tuple {
  def main(args: Array[String]): Unit = {

    //scala 将无关的数据作为一个整体来使用 形成了一个元素的数据组合 简称为元组（Tuple） 元组的数据最多容纳22个
    //   只是限制了数据容纳的个数 没有限定数据容纳的类型
//    val t :(Int,String,Int)
    val t :(Int,String,Int)=(1,"zhangsan",30)

    println(t)
    //根据有效的顺序号访问
    println(t._1)

//    t.productElement(1)
  }
}
