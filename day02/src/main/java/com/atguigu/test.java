package com.atguigu;

public class test {
    public static void main(String[] args) {
/*        int i =0 ;
        i = i++;
        //1) _val=i++ 2) i=_val
//        int j = i++;
        System.out.println(i);*/

//    byte b = 127;  //0111 1111  +1   1000 0000 ==>- 000 0000  也就是byte 的最小值
//    byte b1 =(byte)(b+1);
//        System.out.println(b1);

//        int i =0;
//        int j=i++;
//        System.out.println("i="+i+","+"j="+j); // i=1,j=0

        int i =0;
        i =i++;                                         //字节码解释=====>>>>>
        System.out.println(i); //1) _val=i++ 2) i=_val  =====> 所以最终结果i=0


    }
}
