package com.atguigu.demo

object Demo2 {
  def main(args: Array[String]): Unit = {
    val dataList = List(("zhangsan", "河北", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "鞋"), ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"), ("zhangsan", "河南", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "鞋"), ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"), ("wangwu", "河北", "帽子"), ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"), ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "帽子"), ("lisi", "河北", "衣服"), ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"), ("lisi", "河南", "衣服"), ("wangwu", "河南", "电脑"), ("zhangsan", "河南", "电脑"), ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"))


    //wordCount
    //(word,count) =>(省份-商品，count)
    //TODO 对数据进行结构的转换
    //("wangwu", "河北", "帽子") =>(河北-帽子)

    val mapList: List[String] = dataList.map(t => {
      (t._2 + "-" + t._3)
    })
    mapList

    //TODO 将转换结构后的数据进行分组聚合
    val dataMap: Map[String, List[String]] = mapList.groupBy(date=>date)
    //如果对K-V类型数据进行转换，但是K不变 只对V进行操作时 可以使用mapValues的方法
    val dataToCount: Map[String, Int] = dataMap.mapValues(_.size)
    println(dataToCount)
//    dataMap.map(t=>{
//      (t._1,t._2.size)
//    })

    //TODO 将聚合的结果进行结构的转换

    val prvToDataCountList: List[(String, (String, Int))] = dataToCount.toList.map(t => {
      val K: String = t._1
      val V: Int = t._2
      val ks: Array[String] = K.split("-")
      (ks(0), (ks(1), V))

    })

    //TODO 将转换结构后的数据按照省份进行分组
    val groupMap: Map[String, List[(String, (String, Int))]] = prvToDataCountList.groupBy(_._1)

    println(groupMap)
    //TODO 将分组后的数据根据点击进行排序取前3名
    val top3: Map[String, List[(String, Int)]] = groupMap.mapValues(list => {
      val newList: List[(String, Int)] = list.map(_._2)
      newList.sortBy(_._2)(Ordering.Int.reverse).take(3)
    })
    println(top3)
  }

}
