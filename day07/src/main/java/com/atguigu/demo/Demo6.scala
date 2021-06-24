package com.atguigu.demo

object Demo6 {
  def main(args: Array[String]): Unit = {
/*

    //功能模式中的类型匹配
    val list = List(("a", 1), ("a", 2), ("a", 3))

    list.map(_._2).sum

    list.map {
      case (_, count) => count
    }.sum
*/


    //TODO - 匹配对象
val user = new User("zhangsan",30)
    
    //scala 中匹配对象并不是真正的匹配对象 所谓的匹配对象其实就是匹配对象的所有属性是否相同
    //这里对象的属性比较由scala 自动完成 但是需要遵循特殊的规则 伴生对象中应该有一个方法 unapply
    //zhangsan,30 => apply=>use
    // use=>unapply=>zhangsan,30
    user match {
      case User("zhangsan",30) =>{println("zhangsan")}
    }
  }
  //类前可以使用case 关键字 这样的类称之为样例类 自动实现序列化接口 。 样例类在编译时，自动生成伴生对象
  //样例类 也是个类 所以可以应用在任意场合
  //一般情况下，样例类就是没有主体类容
  //样例类构造对象时 构造参数可以不需要声明为var val  默认使用的val 如果想要更改 那么需要显示声明为var
  case class User(val name: String, val age: Int)
//  object User {
//    def apply(name: String, age: Int): User = new User(name, age)
//
//    def unapply(arg: User): Option[(String, Int)] = {
//      Option((arg.name,arg.age))
//    }
//  }
  }
