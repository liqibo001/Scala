package com.atguigu;

import java.io.IOException;
import java.net.Socket;

public class Test_05_net_client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);

        socket.getOutputStream().write(10);
        socket.close();
    }
}
