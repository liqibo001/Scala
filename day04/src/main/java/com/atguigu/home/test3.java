package com.atguigu.home;

public class test3 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s.append(i);
        }
        System.out.println(s.toString());
    }


}
