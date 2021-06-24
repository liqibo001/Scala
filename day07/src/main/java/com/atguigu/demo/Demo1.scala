package com.atguigu.demo

object Demo1 {
  def main(args: Array[String]): Unit = {
    //集合-功能函数
    // TODO map :将集合中的每一个元素进行转换（A->B）
    val list = List(1,2,3,4)
    list.map(t=>t+"aaa")
    //TODO flatten        List[List[Int]] ===> List[Int]  整体->个体
    val list1: List[List[Int]] = List(List(1,2),List(3,4))
    val flatten: List[Int] = list1.flatten
    println(flatten)


    //TODO flatMap:自定义扁平化规则
    //第一个list表示数据集中的数据元素  第二个list 表示的扁平化后的数据集合
    println(list1.flatMap(list => list))   //List(1, 2, 3, 4)
    //至简原则：编译器能够自动推断，识别出来。
    def fk(data :List[Int]): List[Int] ={
      null
    }
  //如果匿名函数中传递的参数直接返回，那么不能简化成下划线

//TODO groupby
    val list3 = List(1,2,3,4)

    //第一num 表示集合中的每一个元素 第二个num 表示的是分组的key（组名）
    list3.groupBy(num=>num)

    //TODO  filter  过滤
    val list4 = List(1,2,3,4)
    list4.filter(_%2 == 0)

    //TODO sortBy (默认升序)，sortWith
    //第一个num 表示集合中的数据元素  第二个num表示排序的规则
    list4.sortBy(num=>num)(Ordering.Int.reverse)

//    list4.sortWith()
//

  }
}
