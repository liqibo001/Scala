package com.atguigu;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File("input/word.txt")));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File("d:/word.txt")));
        int len;
        byte[] bytes = new byte[8 * 1024];
        while ((len=input.read(bytes)) !=-1){
            output.write(bytes,0,len);
        }
        input.close();
        output.close();
    }
}
