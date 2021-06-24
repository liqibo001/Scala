package com.atguigu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test_05_net_server {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket server = new ServerSocket(9999);
        while (true){
            Socket client = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int read = 0;
                    try {
                        read = client.getInputStream().read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(read);
                }
            }).start();

        }
    }
}
