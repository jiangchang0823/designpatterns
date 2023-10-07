package com.iss.designpatterns;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-09-30 10:27
 **/

public class VolatileTest01 {
    volatile int i;

    public void addI() {
        i++;
    }

    public final String test03(String s1, String s2, String s3) {
        String s = s1 + s2 + s3;
        return s;
    }
    public final String test03(String s1, String s2, String s3, String s4) {
        return s1 + s2 + s3;
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest01 test01 = new VolatileTest01();
        for (int n = 0; n < 1000; n++) {
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test01.addI();
            }).start();
        }
        Thread.sleep(10000);//等待10秒，保证上面程序执行完成
        System.out.println(test01.i);
    }
}
