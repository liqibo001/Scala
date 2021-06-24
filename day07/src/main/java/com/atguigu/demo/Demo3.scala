package com.atguigu.demo

object Demo3 {
  def main(args: Array[String]): Unit = {
    //TODO 模式匹配
    //Java：switch 多重分支判断
    //因为switch语法有歧义 所有scala没有这个语法 但是模拟了一种类似方法：模式匹配。  模式匹配用于规则匹配  模式匹配语法没有break操作，执行完毕后 直接退出
    //模式匹配中的_ 表示除前置case语句外任意值 类似JAVA 中的default的操作
    //模式匹配主要的目的是将数据进行规则匹配 ,必须匹配上 如果没有匹配上会报错
    var a: Int = 10
    var b: Int = 20
    var operator: Char = 'd'
    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"    //模式匹配中的_ 表示除前置case语句外任意值 类似JAVA 中的default的操作
    }
    println(result)
  }
}