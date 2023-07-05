package com.iss.designpatterns.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-29 20:02
 **/

public class ConditionTest {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("await线程获得了锁");
                    condition.await();
                    System.out.println("await线程被唤醒");
                    Thread.sleep(2000);
                    System.out.println("睡眠结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
        },"await_thread");
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        System.out.println("main线程获得了锁");
        condition.signal();
        lock.unlock();
        System.out.println("main线程释放了锁");
        // Thread.sleep(2000);
    }
}
