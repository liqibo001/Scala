package com.atguigu

import scala.collection.mutable.ArrayBuffer
import scala.io.{BufferedSource, Source}

object test2 {
  def main(args: Array[String]): Unit = {
    println("aaa")
    var name: String = "zhangsan"
    var name2 = name.substring(0, 2)
    println(name2 + "aaaa")
    println(
      s"""
         |hello
         |${name}
         |""".stripMargin)
//    val source: BufferedSource = scala.io.Source.fromFile("input/user")
//    source.foreach {
//      line => {
//        println(line)
//      }
//        source.getLines()
//        source.close()


//    }
//    var i: Int = 10
//    var j = i + 10
//    if (i == 10) {
//      println("is true")
//    } else if (i == 11) {
//      println("is true")
//    } else {
//      println("is true")
//    }

    for(i<- Range(1,5) if i != 3; j <- Range(6 ,10)){
      println("i="+i+","+"j="+j)
    }

    def fun1="zhangsan"
    val a =fun1
    val  b = fun1 _
    println(a)
    println(b)
    def  fun2 (f :Int =>Int): Int ={
      f(10)
    }
    fun2(_ *3)

    def  fun3(j:Int): Int ={
      if (j<=1){
        1
      }else{
//        test
        j*fun3(j-1)
      }
    }
    println(fun3(20))
    val array = new ArrayBuffer[Int]()
    for (i <- Range(1,100) ){
      array.append(i)
    }
    println(array.mkString(","))
    val toArray: Array[Int] = array.toArray
  }
}