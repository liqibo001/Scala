package com.atguig.test

import java.io.ObjectInputStream
import java.net.{ServerSocket, Socket}

//接收的
object Worker {
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9999)
    //接收请求
    val client = server.accept()
    val objIn = new ObjectInputStream(client.getInputStream)
//    client.getInputStream

    val task: Task = objIn.readObject().asInstanceOf[Task]
    println(task.computer())
    objIn.close()
    client.close()
    server.close()


  }

}
