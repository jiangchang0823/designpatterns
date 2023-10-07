package com.iss.designpatterns.Inet;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-08-28 18:06
 **/

public class Main {

    public static void main(String[] args) throws IOException {
        // Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        // Runnable multiStatement = () ->{
        //     System.out.println("statement1");
        //     System.out.println("statement2");
        // };
        // Predicate<Long> predicate = (Long s) -> true;
        // Supplier<Integer> supplier = () -> {
        //     System.out.println("i will give you a string");
        //     return 100;
        // };
        // BinaryOperator<Long> binaryOperator =  (l1, l2) -> l1 + l2;
        // System.out.println("---");

        // Stream<String> stringStream = Stream.of("one","two","three","four","five");
        // long count = stringStream.count();
        // System.out.println(count);
        // Stream.of();

        // Stream<String> stringStream = Stream.of("one","two","three","four","five");
        // Map<Integer, Set<Integer>> result = stringStream.collect(Collectors.groupingBy(s -> s.length(), Collectors.mapping(s -> s.indexOf("o"), Collectors.toSet())));
        // System.out.println("----");

        Stream<String> stringStream = Stream.of("one", "two", "three", "four", "five");
        Map<Boolean, Set<String>> result = stringStream.collect(Collectors.partitioningBy(s -> s.length() > 3, Collectors.toSet()));
        System.out.println("----");

    }

}
