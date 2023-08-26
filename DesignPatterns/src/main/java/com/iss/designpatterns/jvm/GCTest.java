package com.iss.designpatterns.jvm;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-08-24 15:00
 **/

public class GCTest {
    private static final int _1MB = 1024 * 1024;



    public static void main(String[] args) {
        // byte[] allocation1 = new byte[6 * _1MB];
        GCTest gcTest = new GCTest();
        System.out.println(gcTest.getClass().getClassLoader());
        String[] strings = new String[3];
        System.out.println(strings.getClass().getClassLoader());
        int[] ints = new int[3];
        System.out.println(ints.getClass().getClassLoader());
    }




}
