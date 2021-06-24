package com.atguigu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("d:/word.txt")));
        String line =null;
        while ((line=reader.readLine()) !=null){
            System.out.println(line);
        }
        reader.close();
    }
}
