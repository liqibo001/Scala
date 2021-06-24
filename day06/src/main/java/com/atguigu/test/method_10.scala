package com.atguigu.test

object method_10 {
  def main(args: Array[String]): Unit = {

    val user1 = new User()
    user1.salary = 1500
    user1.age = 20
    val user2 = new User()
    user2.salary = 1500
    user2.age = 30


    val list = List(user1,user2)
//    list.sortBy(_.salary)
    //元组可以作为整体排序 排序规则为 先排第一个 在排第二个 依次类推
    println(list.sortBy(u=>(u.salary,u.age))(Ordering.Tuple2[Int,Int](Ordering.Int,Ordering.Int.reverse)))   //sort 排序


    //自定义排序规则 sortWith
    val users: List[User] = list.sortWith((user1, user2) => {
      if (user1.salary > user2.salary) {
        true
      } else if (user1.salary == user2.salary) {
        user1.age > user2.age
      } else {
        false
      }
    })
    println(users)
  }

  class User {
    var salary: Int = _
    var age: Int = _

    override def toString: String = {
      s"salary[$salary],age[$age]"
    }
  }

}
