package com.atguigu.test

object Arrar_02 {
  def main(args: Array[String]): Unit = {
    /*TODO 集合-序列 Seq(List)
      Lsit :有序，数据可重复

    */
    /*
        val ints: Seq[Int] = Seq(1,2,3,4)  //不可变集合
        //在使用序列的集合时 使用最多的为list
        val list = List(1,2,3,4) //构建不可变的序列集合
        val ints1: List[Int] = list :+ 5
        val ints2: List[Int] = 6+:list

        println(ints1)
        println(ints2)
        */
    //创建List集合
    //空集合
    val list = Nil

    var list1 = List(5, 6, 7, 8)
    //    添加数据
    println(1 :: 2 :: 3 :: 4 :: list1 ::: Nil)
    //将整体拆分一个一个的个体来使用 称之为扁平化 （使用三个冒号  ::: ）

  }

}
