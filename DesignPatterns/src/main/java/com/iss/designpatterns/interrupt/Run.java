package com.iss.designpatterns.interrupt;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-28 16:22
 **/

public class Run {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();

            // 判断当前线程是否中断（当前线程是指运行this.interrupted()方法的线程。）
            // System.out.println("stop 1??" + thread.interrupted());
            // System.out.println("stop 2??" + thread.interrupted());
            // System.out.println("stop 3??" + thread.interrupted());


            // 终止main线程 interrupted()方法会清除中断标记，所以第二次多用的时候返回了false
            // Thread.currentThread().interrupt();
            // System.out.println("stop 4??" + Thread.interrupted());
            // System.out.println("stop 5??" + Thread.interrupted());


            // 中断指定线程
            System.out.println("stop 6??" + thread.isInterrupted());
            System.out.println("stop 7??" + thread.isInterrupted());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
