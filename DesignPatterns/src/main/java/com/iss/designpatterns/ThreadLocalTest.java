package com.iss.designpatterns;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-29 20:29
 **/

public class ThreadLocalTest {
    private static final ThreadLocal<String> STRING_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<Integer> INTEGER_THREAD_LOCAL = new ThreadLocal<>();
    private static void run(){
        Thread thread = Thread.currentThread();
        STRING_THREAD_LOCAL.set(thread.getName());
        INTEGER_THREAD_LOCAL.set(Integer.valueOf(thread.getName().replace("thread","")));
        System.out.println(thread.getName()+" string is " + STRING_THREAD_LOCAL.get());
        System.out.println(thread.getName()+" integer is " + INTEGER_THREAD_LOCAL.get());
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(ThreadLocalTest::run,"thread1");
        Thread thread2 = new Thread(ThreadLocalTest::run,"thread2");
        thread1.start();
        thread2.start();
    }

}
