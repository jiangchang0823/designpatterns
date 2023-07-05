package com.iss.designpatterns.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-26 15:47
 **/

public class LockTest {

    Lock lock = new ReentrantLock();

    private void testLock() {
        try {
            if (lock.tryLock(5000, TimeUnit.SECONDS)) {
                try {
                    System.out.println(Thread.currentThread().getName() + "获取到锁");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + "释放锁");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "获取锁失败");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockTest lockTest = new LockTest();
        Thread thread1 = new Thread(lockTest::testLock, "thread1");
        Thread thread2 = new Thread(lockTest::testLock, "thread2");
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
    }


}
