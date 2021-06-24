package com.atguigu.home

import scala.collection.immutable
import scala.collection.immutable.StringOps

object Demo4 {
  def main(args: Array[String]): Unit = {
    val dataList = List(("zhangsan", "河北", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "鞋"), ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"), ("zhangsan", "河南", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "鞋"), ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"), ("wangwu", "河北", "帽子"), ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"), ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "帽子"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"), ("wangwu", "河南", "电脑"), ("zhangsan", "河南", "电脑"), ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"))

    val list: List[String] = dataList.map(t => {
      (t._2 + "_" + t._3)
    })
println(list.mkString(","))
    val dateToListMap: Map[String, List[String]] = list.groupBy(date => date)
    println(dateToListMap.mkString(","))
    val dataToCount: Map[String, Int] = dateToListMap.mapValues(_.size)
    println(dataToCount.mkString(","))
    val prvToItemAndCountList: List[(String, (String, Int))] = dataToCount.toList.map(kv => {
      val K: String = kv._1
      val V: Int = kv._2

      val ks: Array[String] = K.split("_")
      (ks(0), (ks(1), V))
    })
    prvToItemAndCountList
    val groupMap: Map[String, List[(String, (String, Int))]] = prvToItemAndCountList.groupBy(_._1)

    val result : Map[String, List[(String, Int)]] = groupMap.mapValues(list => {
      val itemToCountList: List[(String, Int)] = list.map(_._2)
      itemToCountList.sortWith(
        (left, ringht) => {
          left._2 > ringht._2
        }
      )
    })
    println(result)

  }
}
