package com.ctci.basics.java8.lambda;

public class EffectivelyFinal {

    interface FuncTestInterface{
        void sample();
    }

    int x = 10;
    public static void main(String[] args) {
        EffectivelyFinal effectivelyFinal = new EffectivelyFinal();
        FuncTestInterface funcTestInterface = () -> {
            System.out.println("Hello "+ effectivelyFinal.x);
            effectivelyFinal.x += 100;
            //x++;

        };
        funcTestInterface.sample();
        System.out.println(effectivelyFinal.x);
    }

}

