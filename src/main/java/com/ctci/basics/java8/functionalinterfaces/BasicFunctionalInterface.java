package com.ctci.basics.java8.functionalinterfaces;

public interface BasicFunctionalInterface {

    void basicTest(int x);

    default void printTest(){
        System.out.println(" Default Method in interface ");
    }
}
