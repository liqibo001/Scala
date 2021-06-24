package com.atguigu.test

object method_9 {
  def main(args: Array[String]): Unit = {
    // TODO 过滤
    val list1 = List(1, 2, 3, 4)
// filter 方法可以按照指定的规则对数据进行筛选过滤 每一条数据会进行处理 如果处理的结果为true 数据保留 如果数据结果为False 数据丢弃
    println(list1.filter(_ % 2 == 0))  //List(2, 4)


    val list2 = List("hello","spark","scala","hadoop")
    println(list2.filter(_.startsWith("s")))  //过滤  List(spark, scala)

    //TODO 分组 按照指定的分组规则将数据放在一起
    val list3 = List(1, 2, 3, 4)
    //分组key 然后判断符合哪个key
    //分组后 返回的结果为Map类型  K：分组key  V ：符合分组key的数据集合
    println(list3.groupBy(_ % 2 ))  //Map(1 -> List(1, 3), 0 -> List(2, 4))

    val list4 = List("hello","spark","scala","hadoop")
    println(list4.groupBy(_.substring(0, 1)))  // Map(h -> List(hello, hadoop), s -> List(spark, scala))

    // TODO 排序
    val list5 = List(1, 3, 2, 4)
    //sortBy 默认的排序为升序
    println(list5.sortBy(num => num))  //List(1, 2, 3, 4)
    //  更改为降序
    println(list5.sortBy(num => num).reverse) //降序  ==============> 不建议使用
    println(list5.sortBy(num => num)(Ordering.Int.reverse))  //List(4, 3, 2, 1)


    val list6 = List("1","2","11","3","22")
    println(list6.sortBy(s => s.toInt))  //List(1, 2, 3, 11, 22)

    //TODO
  }
}
