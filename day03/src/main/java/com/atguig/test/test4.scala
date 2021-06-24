package com.atguig.test


class test{

}


object test4 {
  def main(args: Array[String]): Unit = {

val test = new test()
    println(test)
    println()
/*
*class 和 object的区别
* TODO object 其实 在编译时候 会产生两个类文件  一个当前类文件  还有一个是单例的类文件
*                    test4.class  test4$.class
*     class 其实 编译时 只会产生前类的class 文件
*    class 其实就是用来修饰普通的类
*    而 object用于修饰 伴随这个类所产生的一个单例对象  用于模仿JAVA中的静态语法
*     object 中的方方和属性 都可以通过类名直接访问 类似于静态方法
*     一般将使用object 声明的类 称之为伴生类 对应那个单例对象称之为伴生对象
*     后来我们统一将相同名称的class object声明的类做了区分
*     使用class 声明的类 ：伴生类
*     使用object声明的类： 伴生对象
*      如果需要通过对象访问属性或者方法 那么就使用class
*       如果需要通过类名就可以直接反问属性或方法 那么就使用object
*
*
 */

  }
}
