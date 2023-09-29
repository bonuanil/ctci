package com.ctci.basics.java8.functionalinterfaces;

public class Example1 {

    public static void main(String[] args) {
        beforeJava8();

        afterJava8();
    }

    private static void afterJava8() {
        new Thread( () -> {
            System.out.println("After JAVA8 Thread");
        }).start();
    }

    private static void beforeJava8() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java 8 Thread");
            }
        }).start();
    }


}
