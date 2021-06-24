package com.atguigu.test

object method_8 {
  def main(args: Array[String]): Unit = {
    val list1 = List(List(1,2),List(3,4),List(5,6,7,8))


    //TODO 扁平化
    //将整体拆分成一个一个的个体来使用 称之为扁平化

val flatten: List[Int] = list1.flatten
    println(flatten)

    //scala 可以将字符串自动作为字符数组来使用
//    [h a d o o p h i v e s p a r k ]
    val list2 = List("hadoop hive spark","hive scala spark")
    println(list2.flatten) //List(h, a, d, o, o, p,  , h, i, v, e,  , s, p, a, r, k, h, i, v, e,  , s, c, a, l, a,  , s, p, a, r, k)

    //如果希望按照自定义的规则进行数据扁平化 可以使用flatMap
    println(list2.flatMap(_.split(" ")))  //List(hadoop, hive, spark, hive, scala, spark)

    val list3 = List(1,2,3,4)

    println(list3.flatMap(List(_)))  //List(1, 2, 3, 4)
  }

}
