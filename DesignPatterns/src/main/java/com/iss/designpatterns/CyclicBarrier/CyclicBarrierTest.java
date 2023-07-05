package com.iss.designpatterns.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-29 21:28
 **/

public class CyclicBarrierTest {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(8, new Runnable() {
            @Override
            public void run() {
                System.out.println("线程"+Thread.currentThread().getName()+"最后完成任务");
            }
        });
        for(int i=0;i<8;i++){
            Thread thread = new Thread(new Task(cyclicBarrier),"thread_"+i);
            thread.start();
        }
    }
    static class Task implements Runnable{
        public Task(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        private CyclicBarrier cyclicBarrier;
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+Thread.currentThread().getName()+"到达栅栏A");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+Thread.currentThread().getName()+"离开栅栏A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+Thread.currentThread().getName()+"到达栅栏B");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("线程"+Thread.currentThread().getName()+"离开栅栏B");
        }
    }
}
