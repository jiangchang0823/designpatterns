package com.iss.designpatterns.mythread;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-07-03 20:58
 **/

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("当前线程是"+Thread.currentThread().getName());
        SimpleRunnable simpleRunnable = new SimpleRunnable();
        new Thread(simpleRunnable).run();
        // simpleRunnable.run();

        SimpleRunnable simpleRunnable1 = new SimpleRunnable();
        new Thread(simpleRunnable1).start();

    }







    static class SimpleRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("当前线程是"+Thread.currentThread().getName());
        }
    }



}
