package com.ctci.basics.java8.streams;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintAllEvenPositionStringsFilterExample {

    public static void main(String[] args) {
        String[] myArray
                = new String[] { "stream",   "is",  "a",
                "sequence", "of",  "elements",
                "like",     "list" };

        AtomicInteger i = new AtomicInteger(0);
        Arrays.stream(myArray).filter(x -> i.getAndIncrement() %2 == 0).forEach(System.out:: println);
    }

}
