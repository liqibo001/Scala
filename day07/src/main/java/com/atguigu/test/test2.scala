package com.atguigu.test

object test2 {
  def main(args: Array[String]): Unit = {
   implicit def transform(d :Double) ={
      d.toInt
    }

    val d: Double = 2.0
    val i : Int =d

    println(i)

  }

}
