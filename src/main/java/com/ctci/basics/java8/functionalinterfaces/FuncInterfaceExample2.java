package com.ctci.basics.java8.functionalinterfaces;

public class FuncInterfaceExample2 {

    interface FuncInterface1 {
        int sample(int x, int y);
    }

    interface FuncInterface2 {
        void sample(String msg);
    }

    public static void main(String[] args) {

        FuncInterface1 multiply = (x, y) -> { return x*y; };
        FuncInterface1 add = (x, y) -> { return x+y; };

        System.out.println(multiply.sample(10,4));
        System.out.println(add.sample(10,4));

    }
}
