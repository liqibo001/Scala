package com.atguigu.chapter05

object test {
  def main(args: Array[String]): Unit = {

    def fun1(num: Int) = {
      num * 2
    }

    println(fun1(6))

    // 如果上一题想讲数字A转换为任意数据源B 不局限为数字 转换规则自己定义 该 如何声明
    //    def fun2(num: Int, f: (Int) => Any): Any = {
    //      f(num)
    //    }
    //    val unit= fun2(5,(a:Int)=>{a*2})
    //    println(unit)
    //规则自己定义 所以 得把规则传进去 所以 得传一个函数
    def fun2(num: Int, f: (Int) => Any): Any = {
      f(num)
    }

    val value: Any = fun2(5, (a: Int) => {
      a * a
    })
    println(value)
    //如果函数调用 test（10,20，c）的计算结果由参数c来决定 这个参数c 你会如何声明
    //    def test(x:Int,y:Int,c:(Int,Int)=>Any)={
    //      c(x,y)
    //    }
    //    test(10,20,(x:Int,y:Int)=>{x-y})


    def test(x: Int, y: Int, c: (Int, Int) => Any) = {
      c(x, y)
    }

    test(10, 20, (x: Int, y: Int) => {
      x + y
    })
    test(10, 20, (x: Int, y: Int) => x + y)
    test(10, 20, (x, y) => x + y)
    test(10, 20, _ + _)

    /* 如果设计一个用于过滤的函数 你会如何做
* 要求 对传递的包含多个单词的字符串参数 根据指定的规格 对word 进行过滤
* 例子："hello world scala spark"=> 首字母为s =>"scala,spark"
*
* */
    def filter(s: String, fun: (String) => Boolean): String = {
      val strings: Array[String] = s.split(" ")
      var result = ""
      for (word <- strings) {
        if (fun(word)) {
          result += "," + word
        }
      }
      val str: String = result.substring(1)
      str
    }

    //filter("hello world scala spark",(word:String)=>{word.startsWith("s")})
    println(filter("hello world scala spark", _.startsWith("s")))

    for (i <- Range(1, 5)) { //不包含5
      println("i=" + i)
    }
    for (i <- 1 to 5) { //包含5
      println("i=" + i)
    }
    for (i <- 1 until 5) { //不包含
      println("i=" + i)
    }

    for (i <- Range(1, 5) if i != 3) {
      println(i)
    }
  }
}