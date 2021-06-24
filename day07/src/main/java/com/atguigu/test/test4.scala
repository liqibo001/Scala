package com.atguigu.test

object test4 {
  def main(args: Array[String]): Unit = {
    val dataList = List(("zhangsan", "河北", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "鞋"), ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"), ("zhangsan", "河南", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "鞋"), ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"), ("wangwu", "河北", "帽子"), ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"), ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "帽子"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"), ("wangwu", "河南", "电脑"), ("zhangsan", "河南", "电脑"), ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"))

    val stringToTuples: Map[String, List[(String, (String, Int))]] = dataList.map(t => {
      (t._2 + "-" + t._3)
    }).groupBy(t => t).mapValues(_.size).toList.map(t => {
      val strings: Array[String] = t._1.split("-")
      (strings(0), (strings(1), t._2))
    }).groupBy(_._1)


    //Map(河南 -> List((河南,(衣服,3)), (河南,(帽子,1)), (河南,(电脑,2)), (河南,(鞋,6))),
    val stringToTuples1: Map[String, List[(String, Int)]] = stringToTuples.mapValues(t => {
      val newList: List[(String, Int)] = t.map(_._2)
      newList.sortBy(s => {
        s._2
      })(Ordering.Int.reverse).take(3)
    })
    println(stringToTuples1)

    println(stringToTuples)







  }

}
