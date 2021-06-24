package com.atguigu.test

object Arrar_05 {
  def main(args: Array[String]): Unit = {

    val map: Map[String, Int] = Map("a" ->1,"b"->2,"c"->3)

    //Option类型： 选项类型
    //              Some(有值)  None(无值)
    //scala 为了避免出现空指针异常，所以创建了Option类型
    val maybeInt: Option[Int] = map.get("a")
/*    if(maybeInt.isEmpty){
      println("指定数据不存在")
    }else{
      println(maybeInt.get)
    }*/
    println(maybeInt.getOrElse(0)) //没取到值就返回 给的默认值 0


    println(map.getOrElse("d", 0))  // 上述两步合并
//    map.getOrElse()

  }
}
