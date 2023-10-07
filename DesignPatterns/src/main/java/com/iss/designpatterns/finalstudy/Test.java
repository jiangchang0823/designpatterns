package com.iss.designpatterns.finalstudy;

import java.util.Random;

public class Test extends Base {
    static Random r = new Random();
    final int k = r.nextInt(10);
    static final int k2 = r.nextInt(10);

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("k=" + t1.k + " k2=" + t1.k2);
        Test t2 = new Test();
        System.out.println("k=" + t2.k + " k2=" + t2.k2);
    }

}
