package com.atguigu.test

object Arrar_01 {
  def main(args: Array[String]): Unit = {

    val strings = new Array[String](3)
    strings(0) = "zhangsan"
    val strings2 = strings :+ "lisi"            /*TODO Scala 中默认的集合都是不可变的
                                                     所有对集合的操作都会产生一个新的集合对象*/
    val strings3 ="wangwu" +: strings           //如果这个运算符以冒号结尾 那么运算规则为从右向左执行

    println(strings.mkString(","))    // zhangsan,null,null
    println(strings2.mkString(","))   //zhangsan,null,null,lisi
    println(strings3.mkString(","))   //wangwu,zhangsan,null,null

    def test(s:String): Unit ={
      println(s)
    }
    strings.foreach(test)   //需要穿一个函数 f:String => U(此处为任意返回值) 定义函数test放进去 循环调用
    strings.foreach((s:String)=>{println(s)})   //以下为简化版
    strings.foreach((s:String)=>println(s))
    strings.foreach((s)=>println(s))
    strings.foreach(s=>println(s))
    strings.foreach(println(_))
    strings.foreach(println)
  }
}
