package com.iss.designpatterns.mythread;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-07-03 20:58
 **/

public class ThreadTest implements Runnable {

    static ThreadTest instance = new ThreadTest();


    @Override
    public void run() {
        synchronized (this) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance);
        Thread thread1 = new Thread(instance);
        thread.start();
        thread1.start();



    }


    static class SimpleRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("当前线程是" + Thread.currentThread().getName());
        }
    }


}
