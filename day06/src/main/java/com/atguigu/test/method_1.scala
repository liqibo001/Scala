package com.atguigu.test

object method_1 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    //迭代
    val iterator: Iterator[Int] = list.iterator
    while (iterator.hasNext){
      iterator.next()
    }

    //衍生集合
    //scala中最常用的算法就是 递归算法
    println(list.head) //头  1
    println(list.tail) //尾  List(2, 3, 4)
    println(list.tails) //递归

    println(list.last) //最后一个 4
    println(list.init) //除了最后一个 List(1, 2, 3)
    println(list.inits)//递归
    //list()+1 =>list(1)+2 =>list(1,2)+3=>list(1,2,3)

    println(list.take(3)) //取前N条数据   List(1, 2, 3)
    println(list.takeRight(3)) //从右边取N条数据  List(2, 3, 4)
    println(list.reverse) //反转 List(4, 3, 2, 1)
    println(list.drop(3)) // 丢弃N个数据  返回的是一个list last是返回一个值     List(4)   //TODO
    println(list.dropRight(2))//从右边丢弃 List(1, 2)


  }
}
