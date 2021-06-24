package com.atguigu.test

object test8 {
  def main(args: Array[String]): Unit = {

    implicit  def transform(student: Student):StudentExt={
      new StudentExt()
    }
    val student = new Student()
    student.updateStudent()
    student.updateStudent()
  }
  class  StudentExt{
    def updateStudent(): Unit ={
      println("update Student")
    }
  }




  class Student {
    def insertStudent(): Unit ={
      println("insert Student")
    }
  }
}
