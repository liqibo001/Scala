package com.atguigu.home

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ArrayBuffer

object Tobuffer_Toarray {
  def main(args: Array[String]): Unit = {
//    val array = Array(1,2,3,4)
//    val buffer: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4)
//    val buffer2: mutable.Buffer[Int] = array.toBuffer
//    buffer2.append(5,6,7)
//    val toArray: Array[Int] = buffer2.toArray
//    println(buffer2.mkString(","))
////    val array1: Array[Int] = buffer.toArray

//    val ints: List[Int] = List(1,2,3,4)
//    val ints1: List[Int] = ints :+ 1
//    println(ints.mkString(","))
//    println(ints.eq(ints1))
//
//
//    val nil: Nil.type = Nil
//val ints2: List[Int] = 1:: 2::3 ::Nil
/*    val tuple: (Int, String, Int) = (1,"zhangsan",30)
   val map: Map[String, Int] = Map("a"->1,"b"->2)
    println(map.mkString(","))
    println(map.getOrElse("a", 0))*/

    val array = new  Array[String](4)
    array(0)="lisi"
    val array1: Array[String] = array :+ "zhansan"
    val seq: immutable.IndexedSeq[Any] = array +: "wangwu"
    println(array.+:("wangwu").mkString(","))
    println(array1.mkString("."))

    println(seq.mkString(","))

    val tuple1 =("zhangsan",1,30)
    print(tuple1._1)





  }
}
