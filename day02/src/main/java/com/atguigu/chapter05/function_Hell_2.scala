package com.atguigu.chapter05

object function_Hell_2 {
  def main(args: Array[String]): Unit = {
   def fun(f :(String)=>Unit): Unit ={
        f("zhangsan")
   }
    fun((name:String)=>{println(name)})
    //如果匿名函数的逻辑代码只有一行 那么大括号可以省略
    fun((name:String)=>println(name))
    //如果参数类型可以推断 那么参数类型可以省略
    fun((name)=>println(name))
    // 如果参数列表中的参数个数只有一个 那么小括号可以省略
    fun(name=>println(name))
    //如果在函数体中 参数只按照顺序使用了一次 那么参数可以省略
    fun(println(_))

    fun(println(_))
  }
}
