package com.atguigu.test

object method {
  def main(args: Array[String]): Unit = {
    // TODO 常用方法
//    集合叫size  元素的大小    容器的长度
    val list = List(1,2,3,4)
    println(list.size) //容纳元素的数量
    println(list.length)//容器的长度
    println(list.isEmpty)//是否为空
    println(list.contains(2))//是否包含
//    List(1,2,3,4) =>"1+2+3+4"=10 不用序列化 可以直接执行的代码块
    println(list.mkString(","))//生成字符串
    def foreachFunction (i:Int): Unit ={
      print(i)
    }
//    list.foreach()
    list.foreach((i:Int)=>print(i))
    list.foreach(print(_)) //至简原则
    list.foreach(println)
    list.foreach(Predef.println) //完整方法



  }

}
