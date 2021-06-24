package com.atguigu.home

object test {
  def main(args: Array[String]): Unit = {
    /*val array = new Array[Int](3)
    val array1 = Array(1,2,34,5,6)

    val list = List(1,2,3,4)
    println(list.filter((num) => num % 2 == 0))


    val list1 = List("hello","spark","scala","hadoop")
    println(list1.filter(world => world.startsWith("s")))  //过滤

    val list2 = List(1,2,3,4,5)
    val intToInts: Map[Int, List[Int]] = list2.groupBy(num=>num%3)  //分组
    println(intToInts)

    val list3 = List("hello","hello","scala")
    println(list3.groupBy(word => word))    //分组 统计


    val list4 =List(3,1,2,4)
    println(list4.sortBy(num => num))  //排序   默认为升序

    println(list4.sortBy(num => -num))  //降序

    println(list4.sortBy(num => num).reverse) //降序

    list4.sortBy(num => num)(Ordering.Int.reverse)//降序
*/
    //字符串排序可以按照字典顺序排序
    /*
    val list = List("1","2","11","3")
        println(list.sortBy(s => s.toInt))
    */

    //自定义类型数据排序

    val user11 = new User()
    user11.age=20
    val user22 = new User()
    user22.age=30
    val list = List(user11,user22)
    println(list.sortBy(user => user.age))



  }

  class User {
    var age: Int = _

    override def toString: String = {
      s"User[$age]"
    }
  }
}
