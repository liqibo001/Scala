package com.atguig.test

object test6 {
  def main(args: Array[String]): Unit = {
    def fun1(s: String, f: (String) => Boolean): String = {
      val strings: Array[String] = s.split(" ")
      var result = ""
      for (elem <- strings) {
        if (f(elem)) {
          result += elem+" "
        }
      }
      return result
    }

    println(fun1("hello world scala spark", (word: String) => {
      word.startsWith("s")
    }))

  }

}
