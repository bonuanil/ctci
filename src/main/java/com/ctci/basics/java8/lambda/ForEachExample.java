package com.ctci.basics.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<Integer> sampleList = new ArrayList<>();
        int i = 1;
        while (i<=40) {
            sampleList.add(i); i++;
        }


        // print all elements of sample list
        sampleList.forEach( n -> System.out.println(n));

        // print whether number is even or odd
        sampleList.forEach( n -> {
            if(n%2 == 0) System.out.println(n + " is even");
            else System.out.println(n + " is odd");
        });


    }
}
