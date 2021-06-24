package com.atguigu.home

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ScalaCollection {
  def main(args: Array[String]): Unit = {
/*
    val strings: Array[String] = new Array[String](5)
    println(strings.length)
    strings(0) = "zhangsan"
    strings(0) = "lisi"

    val strings1: Array[String] = strings :+ "lisi"
    strings1.foreach((s: String) => {
      println(s)
    })
    println(strings.mkString(","))

    val array01 = new Array[Int](4)
    array01(3) = 10
    val i = 10
    array01(i / 3) = 20
    println(array01.mkString(","))

    for (elem <- array01) {
      println(elem)
    }

    array01.foreach((s: Int) => {
      println(s)
    })
    array01.foreach((s: Int) => println(s))
    array01.foreach((s) => println(s))
    array01.foreach(println(_))
    array01.foreach(println)
*/

    val array03:Array[Int]= Array(1, 2, 3, 4)

    val array04 = Array(4, 5, 6, 7)
val buffer1: mutable.Buffer[Int] = array03.toBuffer
    val array2: Array[Int] = buffer1.toArray


val array1 = new Array[String](3)

    val array05: Array[Int] = array03 :+ 5
    println(array05.mkString(","))
    array05.foreach(println(_))

    val array: Array[Array[Int]] = Array.ofDim[Int](3,3)
   array.foreach(l=>l.foreach(println))

val arr7: Array[Int] = Array.range(1,100)
arr7.foreach(println(_))

val ints: Array[Int] = Array.fill(5)(-1)
    println(ints.mkString(","))

     val buffer = new ArrayBuffer[Int]
    for(i <- 1 to 100){

      buffer.append(i)
    }
    buffer.update(90,100)
    buffer.remove(1,90)
    println(buffer.mkString(","))
    for (elem <- buffer) {}
  }
}
