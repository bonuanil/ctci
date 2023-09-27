package com.ctci.basics.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCompareExample {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(100);
        data.add(4);
        data.add(768);
        data.add(8876);
        data.add(0);

        Collections.sort(data, (o1, o2) -> {return o1 < o2 ? -1 : o1 > o2 ? 1 : 0;});

        System.out.println(data);
    }
}
