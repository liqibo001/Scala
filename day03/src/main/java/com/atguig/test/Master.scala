package com.atguig.test

import java.io.ObjectOutputStream
import java.net.Socket

object Master {
  def main(args: Array[String]): Unit = {
      val client = new Socket("localhost",9999)
    //输出
//    client.getOutputStream

    val objOut = new ObjectOutputStream( client.getOutputStream)

    val task = new Task
    objOut.writeObject(task)
    objOut.close()
    client.close()


  }

}
