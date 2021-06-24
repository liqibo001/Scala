package com.atguigu.chapter05

object function01 {
  def main(args: Array[String]): Unit = {
    def fun7(name: String): Unit = {
      println(name)
    }

    fun7(name = "zhangsan")

    def fun8(name: String*): Unit = {
      println(name)
    }

    fun8("zhangsan", "lisi")

    def fun9(password: String, name: String*): Unit = {
      println(password, name)
    }

    fun9("1234", "lisi", "wangwu")

    def fun10(name: String, name2: String): Unit = {
      println(name, name2)
    }

    fun10(name2 = "lisi", name = "wanghwu")

    def fun11(password: String = "1223", name: String): Unit = {
      println(s"name=${name},password=${password}")
    }

    fun11(name = "zhangsan", password = "456")


    def fun1(): Unit = {
      println("无参，无返回值")
    }

    def fun2(name: String): Unit = {
      println("有参无返回值")
    }

    def fun3(name: String): String = {
      return "aaa"
    }
    val name: String = fun3("lisi")
    println(name)

    def fun16(names:String*): Unit ={
      println("fewfqef")
    }
    fun16()

    def fun17():String={
      "zhangsan"
    }
    val str: String = fun17()
    println(str)

    def fun18():String="zhangsan"
    val str1: String = fun18()
    println(str1)

    def  fun19()="zhangsan"

    val str2: String = fun19()
    println(str2)

    def fun20="lisi"
    val fun21: String = fun20
    println(fun21)

    def fun22="hahh"
  }
}
