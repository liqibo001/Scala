package com.atguigu.home;

import static java.lang.Thread.sleep;

public class test2 {
    public static void main(String[] args) {

//new  BB("zhangsan")
//    }
//
//    class AA  {
//        public AA(String name) {
//        }
//    }
//    class  BB extends  AA {
//        public BB(String name ) {
//           super(name);
//        }
//    }
        emp emp = new emp();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                emp.name = "zhangsan";
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(emp.name);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                emp.name = "lisi";
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(emp.name);
            }
        });
        t1.start();
        t2.start();


    }
}

class emp {
    public String name;

}