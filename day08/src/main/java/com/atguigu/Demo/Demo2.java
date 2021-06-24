package com.atguigu.Demo;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        // TODO 泛型的擦除
        // 泛型其实就是一种语法糖 可以对操作的数据类型进行约束 为了糖编译器更好的执行类型验证 所以JVM 执行时不会用上泛型

        //泛型由于是设定对象内部的数据的类型 所以不能考虑父子关系
        //如果泛型不一致 那么对象类型可以应用父子类关系
        test(null);
// 泛型的类型不可变
//泛型可以进行变化  取数据的时候需要约束功能
        //对数据的约束其实分为两种场合
        // 第一种 限定数据的功能
        // 第二种 不能缺失功能
        //泛型的上限和下限
        //泛型的上限一般用于消费数据的场合  设定泛型的上限  功能不缺失   ？extends T
        //泛型的下限一般用于生产数据的场合                              ? super T
    }
    // descriptor: (Ljava/util/List;)V
//    public static  void  test(List<String> names){
//        System.out.println(names);
//    }


    public static  void  test(List<user> names){
        System.out.println(names);
    }
}
//descriptor  参数和返回值