package com.iss.designpatterns.io.bio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-10-06 10:17
 **/

public class SocketClientRequestThread implements Runnable {

    // static {
    //     BasicConfigurator.configure();
    // }

    /**
     * 日志
     */
    private static final Log LOGGER = LogFactory.getLog(SocketClientRequestThread.class);

    /**
     * 这个线层的编号
     *
     * @param countDownLatch
     */
    private final Integer clientIndex;
    private final CountDownLatch countDownLatch;


    /**
     * countDownLatch是java提供的同步计数器。
     * 当计数器数值减为0时，所有受其影响而等待的线程将会被激活。这样保证模拟并发请求的真实性
     *
     * @param countDownLatch 计数器
     */
    public SocketClientRequestThread(CountDownLatch countDownLatch, Integer clientIndex) {
        this.countDownLatch = countDownLatch;
        this.clientIndex = clientIndex;
    }

    @Override
    public void run() {
        Socket socket = null;
        OutputStream clientRequest = null;
        InputStream clientResponse = null;

        try {
            socket = new Socket("localhost", 83);
            clientRequest = socket.getOutputStream();
            clientResponse = socket.getInputStream();

            //等待，直到SocketClientDaemon完成所有线程的启动，然后所有线程一起发送请求
            this.countDownLatch.await();

            //发送请求信息
            clientRequest.write(("这是第" + this.clientIndex + " 个客户端的请求。").getBytes());
            clientRequest.flush();

            //在这里等待，直到服务器返回信息
            LOGGER.info("第" + this.clientIndex + "个客户端的请求发送完成，等待服务器返回信息");
            int maxLen = 1024;
            byte[] contextBytes = new byte[maxLen];
            int realLen;
            StringBuilder message = new StringBuilder();
            //程序执行到这里，会一直等待服务器返回信息(注意，前提是in和out都不能close，如果close了就收不到服务器的反馈了)
            while ((realLen = clientResponse.read(contextBytes, 0, maxLen)) != -1) {
                message.append(new String(contextBytes, 0, realLen));
            }
            SocketClientRequestThread.LOGGER.info("接收到来自服务器的信息:" + message);
        } catch (Exception e) {
            SocketClientRequestThread.LOGGER.error(e.getMessage(), e);
        } finally {
            try {
                if (clientRequest != null) {
                    clientRequest.close();
                }
                if (clientResponse != null) {
                    clientResponse.close();
                }
            } catch (IOException e) {
                SocketClientRequestThread.LOGGER.error(e.getMessage(), e);
            }
        }
    }
}
