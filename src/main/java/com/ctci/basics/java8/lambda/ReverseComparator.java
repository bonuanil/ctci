package com.ctci.basics.java8.lambda;

import java.util.TreeSet;

public class ReverseComparator {

    public static void main(String[] args) {
        TreeSet<String> data = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        data.add("Hello");
        data.add("A");
        data.add("World");
        data.add("Sample");

        System.out.println(data);
    }
}
