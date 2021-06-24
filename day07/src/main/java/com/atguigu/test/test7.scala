package com.atguigu.test
import scala.collection.immutable
import scala.util.control.Breaks._

object test7 {
  def main(args: Array[String]): Unit = {

    //    val a = new String("abc")
    //    val b = new String("abc")
    //    println(a == b)
    //    println(a.equals(b))
    //    println(a.eq(b))

//    var b = true
//    if (b) {
//      println("is true")
//    } else {
//      println("is false")
//    }
    for (elem <- Range(1, 5)) {
      println(s"elem=${elem}")
    }

    for (elem <- Range(1, 6,2);if elem !=3) {
      println(s"elem=${elem}")
    }
    for (elem <- Range(1, 5);j<- Range(1,5)) {
      println(s"elem=${elem},j=${j}")
    }

    val result: immutable.IndexedSeq[Int] = for (elem <- Range(1, 5);j = elem -1) yield {
      elem+j
    }
    println(result)

    breakable{
      for (elem <- 1 to 6) {
        if (elem ==3){
          break()
        }
        println(elem)
      }
    }

      def  fun77(name:String,age:Int=10): Unit ={
        println(name,age)

      }
      fun77("zhangsan1")


//    def fun1 () ={
//      "zhangsan"
//    }
//    val a: String = fun1
//  val b =  fun1 _
//    println(a)
//    println(b)
//
//    def  fun22(f :Int=>Int):Int={
//      f(10)
//    }
//    println(fun22(_ * 2))
//
//    def fun (i:Int)(j:Int) ={
//      i*j
//    }
//
//    println(fun(2)(3))

    def fun6(int: Int):Int={
      if (int<=1){
        1
      }else{
        int*fun6(int-1)
      }
    }

    println(fun6(10))

    val list = List(
      ("a", 1), ("b", "bb"), ("c", 3)
    )
list.map((t: (String, Any)) => t match {
  case t._2 :Int => t._2+1
  case b=>b
})

  }
}
