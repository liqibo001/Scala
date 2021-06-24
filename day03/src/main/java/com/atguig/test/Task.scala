package com.atguig.test

class Task extends Serializable {
 val num: Int =2
  val logic = (x:Int)=>{x*2}
  def computer(): Int={
    logic(num)


  }
}
