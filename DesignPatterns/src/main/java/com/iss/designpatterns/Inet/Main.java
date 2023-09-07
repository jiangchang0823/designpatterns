package com.iss.designpatterns.Inet;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-08-28 18:06
 **/

public class Main {

    public static void main(String[] args) throws IOException {


        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        SocketAddress socketAddress = new InetSocketAddress(80);
        serverSocketChannel.bind(socketAddress);
        SocketChannel socketChannel = serverSocketChannel.accept();
    }

}
