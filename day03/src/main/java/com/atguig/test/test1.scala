package com.atguig.test

object test1 {

  //opr(10)(20)()
  def main(args: Array[String]): Unit = {

    def opr(x: Int) = {

      def mid(y: Int) = {

        def inner(f: (Int, Int) => Int) = {
          f(x, y)
        }
        inner _
      }
      mid _
    }
  }
}
