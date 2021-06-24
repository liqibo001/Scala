package com.atguigu.home

object home2 {
  def main(args: Array[String]): Unit = {
    new User("zhangsan")
  }

abstract  class Parent(name: String) {
def test():Unit
    println(name)
  }

  class User(name: String) extends Parent(name) {
    def test():Unit={

    }
  }

}
